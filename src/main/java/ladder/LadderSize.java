package ladder;

public class LadderSize {
    NaturalNumber row;
    NaturalNumber numberOfPerson;

    public LadderSize(NaturalNumber row, NaturalNumber numberOfPerson) {
        this.row = row;
        this.numberOfPerson = numberOfPerson;
    }

    public int getRow(){
        return row.getValue();
    }
    public int getNumberOfPerson(){
        return numberOfPerson.getValue();
    }

}
