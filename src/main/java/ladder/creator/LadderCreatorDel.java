package ladder.creator;

import ladder.LadderSize;
import ladder.NaturalNumber;
import ladder.Position;
import ladder.Row;

import static ladder.NaturalNumber.createNaturalNumber;

public class LadderCreator {
    private final Row[] rows;

    public LadderCreator(LadderSize ladderSize) {

    }

    public void drawLine(Position position) {
        rows[position.getX().getValue()].draw(position.getY());
    }

    public int getNumberOfFloors(){
        return rows.length;
    }

    public int getNumberOfPerson(){
        return rows[0].getNumberOfPerson();
    }

    public Row[] getRows(){
        return rows;
    }
}
