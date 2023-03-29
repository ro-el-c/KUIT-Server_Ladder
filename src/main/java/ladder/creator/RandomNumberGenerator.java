package ladder.creator;

import ladder.NaturalNumber;

public class RandomNumberGenerator {
    public int getRandomNumber(int max){
        return (int) (Math.random() * max + 1);
    }
}
