package ladder.creator;

import ladder.LadderPosition;
import ladder.LadderSize;
import ladder.Row;

import static ladder.NaturalNumber.createNaturalNumber;

public class CustomLadderCreator implements LadderCreator{
    private final Row[] rows;
    private final LadderSize ladderSize;

    public CustomLadderCreator(LadderSize ladderSize) {
        this.ladderSize = ladderSize;
        rows = new Row[ladderSize.getHeight()];
        for (int i = 0; i < ladderSize.getHeight(); i++) {
            rows[i] = new Row(createNaturalNumber(ladderSize.getNoOfPerson()));
        }
    }

    public LadderSize getLadderSize() {
        return ladderSize;
    }

    public void drawLine(LadderPosition ladderPosition) {
        rows[ladderPosition.getRowPosition()].drawLine(ladderPosition.getCol());
    }

    public Row[] getRow() {
        return rows;
    }
}
