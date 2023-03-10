package ladder;

import static ladder.NaturalNumber.*;

public class Row {
    Node[] nodes;

    public Row(NaturalNumber numberOfPerson) {
        nodes = new Node[numberOfPerson.getNumber()];
        for (int i = 0; i < numberOfPerson.getNumber(); i++) {
            nodes[i] = Node.createCenterNode();
        }
    }

    public void drawLine(Position startPosition) {
        validateDrawLinePosition(startPosition);

        nodes[startPosition.getPosition()] = Node.createRightNode();
        nodes[startPosition.getPosition() + 1] = Node.createLeftNode();
    }

    public void nextPosition(Position position) {
        validatePositionSize(position);
        nodes[position.getPosition()].move(position);
    }

    private void validatePositionSize(Position position) {
        if (!position.isSmaller(nodes.length)) {
            throw new IllegalArgumentException();
        }
    }

    private void validateDrawLinePosition(Position startPosition) {
        if (!canInstallLine(startPosition)) {
            throw new IllegalArgumentException();
        }
    }

    public boolean canInstallLine(Position startPosition) {
        return startPosition.getPosition() < nodes.length - 1 && !nodes[startPosition.getPosition()].isLeft() && !nodes[startPosition.getPosition()+1].isRight();
    }

    public void generateRow(StringBuilder sb, Position currentRow, LadderPosition ladderPosition) {
        for (int i = 0; i < nodes.length; i++) {
            nodes[i].appendSymbol(sb);
            if (LadderPosition.createLadderPosition(currentRow, Position.createPosition(i)).equals(ladderPosition)) {
                sb.append("*");
            }
            sb.append(" ");
        }
        sb.append("\n");
    }

}