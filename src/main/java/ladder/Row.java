package ladder;

public class Row {

    int[] row;

    public Row(int numberOfPerson) {
        validateNumberOfPerson(numberOfPerson);
        row = new int[numberOfPerson];
    }

    public void drawLine(int startPosition) {
        validateDrawLinePosition(startPosition);
        row[startPosition] = Direction.RIGHT.getDirection();
        row[startPosition + 1] = Direction.LEFT.getDirection();
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
        return row[nthOfPerson - 1] == Direction.LEFT.getDirection();
    }

    private boolean isNoLine(int nthOfPerson) {
        return row[nthOfPerson - 1] == Direction.CENTER.getDirection();
    }

    private void validateNumberOfPerson(int numberOfPerson) {
        if (numberOfPerson < 1) {
            throw new IllegalArgumentException();
        }
    }

    private void validateNthOfPerson(int nthOfPerson) {
        if (nthOfPerson > row.length || nthOfPerson < 1) {
            throw new IllegalArgumentException();
        }
    }

    private void validateDrawLinePosition(int startPosition) {
        if (startPosition >= row.length - 1 || startPosition < 0 || row[startPosition] == -1 || row[startPosition + 1] == 1) {
            throw new IllegalArgumentException();
        }
    }
}