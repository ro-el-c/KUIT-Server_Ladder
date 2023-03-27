package ladder;

public class LadderRunner {
    private final Row[] rows;

    public LadderRunner(Row[] rows) {
        this.rows = rows;
    }


    public void run(LadderPlayPoint ladderNum) {
        for(int i=0; i<rows.length; i++) {
            rows[i].nextPosition(ladderNum);
        }
    }
}
