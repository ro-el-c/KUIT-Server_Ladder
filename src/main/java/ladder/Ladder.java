package ladder;

public class Ladder {

    private final Row[] rows;

    public Ladder(NaturalNumber row, NaturalNumber numberOfPerson) {
        rows = new Row[row.getNumber()];
        for (int i = 0; i < row.getNumber(); i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }

    public void drawLine(Position row, Position col) {
        rows[row.getPosition()].drawLine(col);
    }


    public int run(Position position) {

        for (int i = 0; i < rows.length; i++) {
            rows[i].nextPosition(position);
        }

        return position.getPosition();
    }
}
