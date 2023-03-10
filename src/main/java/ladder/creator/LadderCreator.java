package ladder.creator;

import ladder.LadderSize;
import ladder.NaturalNumber;
import ladder.Position;
import ladder.Row;

import static ladder.NaturalNumber.*;

public class LadderCreator{

    private final Row[] rows;

    public LadderCreator(LadderSize ladderSize) {
        rows = new Row[ladderSize.getHeight()];
        for (int i = 0; i < ladderSize.getHeight(); i++) {
            rows[i] = new Row(createNaturalNumber(ladderSize.getNoOfPerson()));
        }
    }

    public void drawLine(Position row, Position col) {
        rows[row.getPosition()].drawLine(col);
    }

    public Row[] getRow() {
        return rows;
    }
}
