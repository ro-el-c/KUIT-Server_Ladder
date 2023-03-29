package ladder;

import ladder.creator.LadderCreator;

public class Position {
    NaturalNumber x;
    NaturalNumber y;
    // pointX의 범위

    public Position(NaturalNumber positionRow, NaturalNumber positionCol, LadderCreator ladderCreator) {
        validateX(positionRow, ladderCreator);
        this.x = NaturalNumber.createNaturalNumber(positionRow.getValue());
        validateY(positionCol, ladderCreator);
        this.y = NaturalNumber.createNaturalNumber(positionCol.getValue());
    }

    public NaturalNumber getX() {
        return x;
    }

    public NaturalNumber getY() {
        return y;
    }

    // TODO: 적절한 validation 위치 더 고민해보기
    private void validateX(NaturalNumber positionRow, LadderCreator ladderCreator){
        if(positionRow.getValue() >= ladderCreator.getNumberOfFloors()-1)
            throw new IllegalArgumentException("사다리 층을 벗어났습니다.");
    }
    private void validateY(NaturalNumber positionCol, LadderCreator ladderCreator){
        if(positionCol.getValue() > ladderCreator.getNumberOfPerson()-1)
            throw new IllegalArgumentException("사다리 라인을 생성할 수 있는 위치가 아닙니다.");
    }
}
