package ladder;

public class Ladder {


    private final Row[] rows;


    public Ladder(int row, int numberOfPerson) {
        rows = new Row[row];
        for (int i = 0; i < row; i++) {
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
