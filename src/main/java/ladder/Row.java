package ladder;

import static ladder.Direction.*;

public class Row {
    int[] floor;

    public Row(NaturalNumber numberOfPerson) {
        this.floor = new int[numberOfPerson.getValue()+1]; // 사람이 사다리를 고를 때, 자연수를 선택하도록
    }

    public void draw(int positionY) { // 왼쪽으로 사다리 라인 생성
        validatePositionY(positionY);
        floor[positionY] = LEFT.getDirection();
        floor[positionY-1] = RIGHT.getDirection();
    }

    public int nextPosition(int ladderNum) {
        if (floor[ladderNum] == LEFT.getDirection()) return LEFT.getDirection();
        if (floor[ladderNum] == RIGHT.getDirection()) return RIGHT.getDirection();
        return DOWN.getDirection();
    }


    private void validatePositionY(int positionY) {
        if(floor[positionY] != 0)
            throw new IllegalArgumentException("사다리 라인이 이미 존재합니다.");
    }

    public int getNumberOfPerson(){
        return floor.length;
    }
}
