package ladder.creator;

import ladder.*;

import static ladder.NaturalNumber.*;

public class LadderCreator{

    private final Row[] rows;

    public LadderCreator(LadderSize ladderSize) {
        rows = new Row[ladderSize.getHeight()];
        for (int i = 0; i < ladderSize.getHeight(); i++) {
            rows[i] = new Row(createNaturalNumber(ladderSize.getNoOfPerson()));
        }
    }

    public void drawLine(LadderPosition ladderPosition) {
        rows[ladderPosition.getRowPosition()].drawLine(ladderPosition.getCol());
    }

    public Row[] getRow() {
        return rows;
    }
}
