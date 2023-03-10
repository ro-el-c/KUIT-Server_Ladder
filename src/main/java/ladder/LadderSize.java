package ladder;

public class LadderSize {
    private final NaturalNumber height;
    private final NaturalNumber noOfPerson;

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

    public int getSize() {
        return getHeight()*getNoOfPerson();
    }

    static LadderSize create(NaturalNumber height, NaturalNumber noOfPerson) {
        return new LadderSize(height, noOfPerson);
    }
}
