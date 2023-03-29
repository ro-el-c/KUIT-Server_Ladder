package ladder;

public class LadderSize {
    private final NaturalNumber row;
    private final NaturalNumber numberOfPerson;

    private LadderSize(NaturalNumber row, NaturalNumber numberOfPerson) {
        this.row = row;
        this.numberOfPerson = numberOfPerson;
    }

    public static LadderSize createLadderSize(NaturalNumber row, NaturalNumber numberOfPerson){
        return new LadderSize(row, numberOfPerson);
    }

    public int getRow(){
        return row.getValue();
    }
    public int getNumberOfPerson(){
        return numberOfPerson.getValue();
    }

    public int getLadderSize() { return (getRow()-2) * getNumberOfPerson(); }
}
