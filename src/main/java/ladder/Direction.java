package ladder;

public enum Direction {
    LEFT(-1),
    RIGHT(1),
    DOWN(0);

    Direction(int value) {
        this.value = value;
    }

    private final int value;
    public int getDirection(){
        return value;
    }
}
