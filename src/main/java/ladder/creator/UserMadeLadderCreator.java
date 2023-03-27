package ladder.creator;

import ladder.LadderSize;
import ladder.Position;
import ladder.Row;

import static ladder.NaturalNumber.createNaturalNumber;

public class UserMadeLadderCreator implements LadderCreator {
    private final Row[] rows;

    public UserMadeLadderCreator(LadderSize ladderSize){
        rows = new Row[ladderSize.getRow()];
        for (int i = 0; i < ladderSize.getRow(); i++) {
            rows[i] = new Row(createNaturalNumber(ladderSize.getNumberOfPerson()));
        }
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
