package ladder;

public class LadderRunner {
    private final Row[] rows;

    public LadderRunner(Row[] rows) {
        this.rows = rows;
    }

    public void run(LadderPlayPoint ladderNum) {
        for(int i=0; i<rows.length; i++) {
            // TODO: 움직이기 전 출력
            rows[i].nextPosition(ladderNum);
            // TODO: 움직인 후 출력
        }
    }
}
