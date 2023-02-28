package ladder;

public class Row {

    int[] row;

    public Row(int numberOfPerson) {
        row = new int[numberOfPerson];
    }

    public void drawLine(int startPosition) {
        row[startPosition] = 1;
        row[startPosition + 1] = -1;
    }

    public int nextPosition(int nthOfPerson) {
        validateNthOfPerson(nthOfPerson);

        if (isNoLine(nthOfPerson)) {
            return nthOfPerson;
        }
        if (isLeft(nthOfPerson)) {
            return nthOfPerson - 1;
        }
        return nthOfPerson + 1;
    }

    private boolean isLeft(int nthOfPerson) {
        return row[nthOfPerson - 1] == -1;
    }

    private boolean isNoLine(int nthOfPerson) {
        return row[nthOfPerson - 1] == 0;
    }

    private void validateNthOfPerson(int nthOfPerson) {
        if (nthOfPerson > row.length) {
            throw new IllegalArgumentException();
        }
    }
}