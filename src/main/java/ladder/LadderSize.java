package ladder;

public class LadderSize {
    NaturalNumber height;
    NaturalNumber noOfPerson;

    private LadderSize(NaturalNumber height, NaturalNumber noOfPerson) {
        this.height = height;
        this.noOfPerson = noOfPerson;
    }

    public int getHeight() {
        return height.getNumber();
    }

    public int getNoOfPerson() {
        return noOfPerson.getNumber();
    }

    static LadderSize create(NaturalNumber height, NaturalNumber noOfPerson) {
        return new LadderSize(height, noOfPerson);
    }
}
