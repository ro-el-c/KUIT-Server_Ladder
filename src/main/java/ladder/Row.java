package ladder;

public class Row {

    int[] row;

    public Row(NaturalNumber numberOfPerson) {
        row = new int[numberOfPerson.getNumber()];
    }

    public void drawLine(Position startPosition) {
        validateDrawLinePosition(startPosition);
        row[startPosition.getPosition()] = Direction.RIGHT.getDirection();
        row[startPosition.getPosition() + 1] = Direction.LEFT.getDirection();
    }

    private void validateDrawLinePosition(Position startPosition) {
        validatePositionSize(startPosition);
        if (row[startPosition.getPosition()] == Direction.LEFT.getDirection() ||
                row[startPosition.getPosition() + 1] == Direction.RIGHT.getDirection()) {
            throw new IllegalArgumentException();
        }
    }

    public void nextPosition(Position position) {
        validatePositionSize(position);
        if (isNoLine(position)) {
            return;
        }
        if (isLeft(position)) {
            position.goLeft();
            return;
        }
        position.goRight();
    }

    private boolean isLeft(Position position) {
        return row[position.getPosition()] == Direction.LEFT.getDirection();
    }

    private boolean isNoLine(Position position) {
        return row[position.getPosition()] == Direction.CENTER.getDirection();
    }

    private void validatePositionSize(Position position) {
        if (!position.isSmaller(row.length)) {
            throw new IllegalArgumentException();
        }
    }

}