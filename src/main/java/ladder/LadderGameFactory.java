package ladder;

import ladder.creator.CustomLadderCreator;
import ladder.creator.LadderCreator;
import ladder.creator.RandomLadderCreator;

public class LadderGameFactory {

    public static LadderGame createCustomLadderGame(LadderSize ladderSize){
        CustomLadderCreator customLadderCreator = new CustomLadderCreator(ladderSize);
        return new LadderGame(customLadderCreator);
    }

    public static LadderGame createRandomLadderGame(LadderSize ladderSize){
        CustomLadderCreator customLadderCreator = new CustomLadderCreator(ladderSize);
        RandomLadderCreator randomLadderCreator = new RandomLadderCreator(customLadderCreator);
        return new LadderGame(randomLadderCreator);
    }
}
