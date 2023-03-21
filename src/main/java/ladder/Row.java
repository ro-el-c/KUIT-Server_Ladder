package ladder;

import static ladder.Direction.*;

public class Row {
    // TODO: nums 이름 바꾸기
    int[] nums;

    public Row(int numberOfPerson) {
        this.nums = new int[numberOfPerson];
    }


    public void draw(int y) {
        nums[y] = RIGHT.value();
        nums[y+1] = LEFT.value();
    }

    public int nextPosition(int ladderNum) {
        if (nums[ladderNum] == RIGHT.value()) return RIGHT.move();
        if (nums[ladderNum] == LEFT.value()) return LEFT.move();
        return DOWN.move();
    }
}
