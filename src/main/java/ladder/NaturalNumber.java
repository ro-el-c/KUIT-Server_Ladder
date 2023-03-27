package ladder;

public class NaturalNumber {
    private final int value;

    private NaturalNumber(int value) {
        this.value = value;
    }

    public static NaturalNumber createNaturalNumber(int value){
        validate(value);
        return new NaturalNumber(value);
    }

    private static void validate(int value) {
        if(value <= 0){
            throw new IllegalArgumentException("자연수는 1 이상입니다.");
        }
    }

    public int getValue() {
        return value;
    }
}
