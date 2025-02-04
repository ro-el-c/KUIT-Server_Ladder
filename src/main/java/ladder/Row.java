package ladder;

public class Row {
    Node[] nodes;

    public Row(NaturalNumber numberOfPerson) {
        nodes = new Node[numberOfPerson.getValue()+1];
        for (int i=0; i<numberOfPerson.getValue()+1; i++){
            nodes[i] = Node.createDownNode();
        }
    }

    public void draw(NaturalNumber positionY) { // 왼쪽으로 사다리 라인 생성
        validatePositionY(positionY);
        nodes[positionY.getValue()] = Node.createRightNode();
        nodes[positionY.getValue()+1] = Node.createLeftNode();
    }

    public void nextPosition(LadderPlayPoint ladderNum) {
        if (nodes[ladderNum.getValue()].isLeft()){
            ladderNum.goLeft();
            return;
        }

        if (nodes[ladderNum.getValue()].isRight())
            ladderNum.goRight();
    }

    private void validatePositionY(NaturalNumber positionY) {
        if(nodes[positionY.getValue()].isRight() || nodes[positionY.getValue()].isLeft())
            throw new IllegalArgumentException("사다리 라인이 이미 존재합니다.");
    }

    public int getNumberOfPerson(){
        return nodes.length-1;
    }

    public void printer(StringBuilder sb, int col, boolean isFloor) {
        for (int i=1; i<nodes.length; i++){
            sb.append(nodes[i].getDirection());
            if(isFloor && i == col) sb.append("*");
            sb.append("\t");
        }
    }
}
