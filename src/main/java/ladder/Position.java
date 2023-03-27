package ladder;

public class Position {
    NaturalNumber x;
    NaturalNumber y;
    // pointX의 범위

    public Position(NaturalNumber pointX, NaturalNumber pointY, LadderCreator ladderCreator) {
        validateX(pointX, ladderCreator);
        this.x = new NaturalNumber(pointX.getValue());
        validateY(pointY, ladderCreator);
        this.y = new NaturalNumber(pointY.getValue());
    }

    public NaturalNumber getX() {
        return x;
    }

    public NaturalNumber getY() {
        return y;
    }

    // TODO: 적절한 validation 위치 더 고민해보기
    private void validateX(NaturalNumber pointX, LadderCreator ladderCreator){
        if(pointX.getValue() >= ladderCreator.getNumberOfFloors()-1)
            throw new IllegalArgumentException("사다리 층을 벗어났습니다.");
    }
    private void validateY(NaturalNumber pointY, LadderCreator ladderCreator){
        if(pointY.getValue() == 1 || pointY.getValue() > ladderCreator.getNumberOfPerson())
            throw new IllegalArgumentException("사다리 라인을 생성할 수 있는 위치가 아닙니다.");
    }
}
