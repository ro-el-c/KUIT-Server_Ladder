package ladder.creator;

import ladder.LadderSize;
import ladder.Position;
import ladder.Row;

import static ladder.NaturalNumber.createNaturalNumber;

public class CustomLadderCreator implements LadderCreator {
    LadderSize ladderSize;
    private final Row[] rows;

    public CustomLadderCreator(LadderSize ladderSize){
        this.ladderSize = ladderSize;
        rows = new Row[ladderSize.getRow()+1];
        for (int i = 0; i <= ladderSize.getRow(); i++) {
            rows[i] = new Row(createNaturalNumber(ladderSize.getNumberOfPerson()));
        }
    }

    public void drawLine(Position position) {
        rows[position.getX().getValue()].draw(position.getY());
    }

    public int getNumberOfFloors(){
        return rows.length-1;
    }

    public int getNumberOfPerson(){
        return rows[0].getNumberOfPerson();
    }

    public Row[] getRows(){
        return rows;
    }

    public LadderSize getLadderSize(){ return ladderSize; }
}
