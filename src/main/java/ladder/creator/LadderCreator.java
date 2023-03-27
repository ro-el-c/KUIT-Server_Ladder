package ladder;

public class LadderCreator {
    private final Row[] rows;

    public LadderCreator(NaturalNumber row, NaturalNumber numberOfPerson) {
        rows = new Row[row.getValue()];
        for (int i = 0; i < row.getValue(); i++) {
            rows[i] = new Row(numberOfPerson);
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
