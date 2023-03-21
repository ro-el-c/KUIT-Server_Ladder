package ladder;

public class Ladder {
    //private final int[][] rows;
    private final Row[] rows;

    public Ladder(int row, int numberOfPerson) {
        validateNum(row, numberOfPerson);
        rows = new Row[row];
        for (int i = 0; i < row; i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }

    public void drawLine(Position position) {
        // TODO: Ladder에 맞게 validate position
        // X는 0이 되면 안 되고 사다리 범위 내에 있어야 함
        // Y는 인덱스 사람수-1 미만
        rows[position.getX()].draw(position.getY());
    }

    public int run(int ladderNum) {
        int row = 0;

        while (row < rows.length) {
            ladderNum += rows[row].nextPosition(ladderNum);
            row++;
        }

        return ladderNum;
    }

    // TODO: row, numberOfPerson wrapper class 생성하면 없어질 validation
    private static void validateNum(int row, int numberOfPerson) {
        // 사람 - 2명 이상
        // 사다리 - (사람수+1)층 이상
        //  -> 사다리 라인이 (사람수-1)개 이상이라고 "가정"
        if (numberOfPerson < 2) {
            throw new IllegalArgumentException("사람이 2명 미만입니다.");
        }
        if (row < numberOfPerson + 1) {
            throw new IllegalArgumentException("사다리 층이 부족합니다.");
        }
    }
}