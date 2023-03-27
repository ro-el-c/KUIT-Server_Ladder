package ladder;

public class NaturalNumber {
    private final int value;

    public NaturalNumber(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if(value <= 0){
            throw new IllegalArgumentException("자연수는 1 이상입니다.");
        }
    }

    public int getValue() {
        return value;
    }
}
