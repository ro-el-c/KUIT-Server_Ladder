package ladder;

public class Ladder {
    private final int[][] rows;

    public Ladder(int row, int numberOfPerson) {
        validateNum(row, numberOfPerson);
        rows = new int[row][numberOfPerson];
    }

    public void drawLine(Position position) {
        rows[position.getPointX()][position.getPointY()] = 1;
        rows[position.getPointX()][position.getPointY()+1] = -1;
    }

    public int run(int ladderNum){
        int row=0;

        while(row<rows.length){
            if(rows[row][ladderNum] == 1) {
                row++;
                ladderNum++;
                continue;
            }
            if(rows[row][ladderNum] == -1){
                row++;
                ladderNum--;
                continue;
            }
            row++;
        }

        return ladderNum;
    }

    private static void validateNum(int row, int numberOfPerson) {
        // 사람 - 2명 이상
        // 사다리 - (사람수+1)층 이상
        //  -> 사다리 라인이 (사람수-1)개 이상이라고 "가정"
        if (numberOfPerson < 2) {
            System.out.println("사람이 2명 미만입니다.");
            throw new IllegalArgumentException();
        }
        if (row < numberOfPerson + 1) {
            System.out.println("사다리 층이 부족합니다.");
            throw new IllegalArgumentException();
        }
    }

    public int getNumberOfPerson(){
        return rows[0].length;
    }

    public int getLadderLength(){
        return rows.length;
    }

    public int getValue(int x, int y){
        return rows[x][y];
    }
}