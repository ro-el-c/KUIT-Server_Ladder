package ladder;

import ladder.creator.LadderCreator;

public class LadderGame {
    private final LadderCreator ladderCreator;

    public LadderGame(LadderCreator ladderCreator) {
        this.ladderCreator = ladderCreator;
    }

    public void drawLine(Position position) {
        ladderCreator.drawLine(position);
    }

    public int run(LadderPlayPoint ladderNum) {
        LadderRunner ladderRunner = new LadderRunner(ladderCreator.getRows());
        ladderRunner.run(ladderNum);

        return ladderNum.getValue();
    }
}