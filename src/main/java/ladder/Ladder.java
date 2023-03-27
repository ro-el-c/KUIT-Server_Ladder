package ladder;

// 사람, 사다리 - 자연수 (1 이상)
// [가정 수정]
// 사다리 라인 그릴 위치 (Position)의 x, y -> 1 이상이어야 하므로, 사다리 라인을 왼쪽으로 그린다고 가정

public class Ladder {
    //private final int[][] rows;
    private final Row[] rows;

    public Ladder(NaturalNumber row, NaturalNumber numberOfPerson) {
        rows = new Row[row.getValue()];
        for (int i = 0; i < row.getValue(); i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }

    public void drawLine(Position position) {
        rows[position.getX().getValue()].draw(position.getY());
    }


    public int run(int ladderNum) {
        for(int i=0; i<rows.length; i++) {
            ladderNum += rows[i].nextPosition(ladderNum);
        }

        return ladderNum;
    }


    public int getNumberOfFloors(){
        return rows.length;
    }

    public int getNumberOfPerson(){
        return rows[0].getNumberOfPerson();
    }
}