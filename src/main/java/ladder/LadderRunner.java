package ladder;

public class LadderRunner {
    private final Row[] rows;

    public LadderRunner(Row[] rows) {
        this.rows = rows;
    }

    public void run(LadderPlayPoint ladderNum) {
        for(int row=1; row<rows.length; row++) {
            System.out.println("Before");
            printer(row, ladderNum);

            rows[row].nextPosition(ladderNum);
            System.out.println("After");
            printer(row, ladderNum);

            System.out.println("--------------------");
        }
    }

    public void printer(int rowNow, LadderPlayPoint ladderNum){
        StringBuilder sb = new StringBuilder();
        boolean isFloor;
        // 현재 나의 위치: i, ladderNum
        for(int row=1; row<rows.length; row++){
            if(row==rowNow) isFloor = true;
            else isFloor=false;
            rows[row].printer(sb, ladderNum.getValue(), isFloor);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
