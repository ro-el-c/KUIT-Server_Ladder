package ladder;

public class Ladder {

    private final Row[] rows;

    public Ladder(NaturalNumber row, NaturalNumber numberOfPerson) {
        rows = new Row[row.getNumber()];
        for (int i = 0; i < row.getNumber(); i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }

    public void drawLine(int row, int col) {
        rows[row].drawLine(col);
    }

    public int run(int nthOfPerson) {

        for (int i = 0; i < rows.length; i++) {
            nthOfPerson = rows[i].nextPosition(nthOfPerson);
        }

        return nthOfPerson;
    }
}
