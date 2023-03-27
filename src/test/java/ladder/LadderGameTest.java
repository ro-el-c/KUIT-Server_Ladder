package ladder;

import ladder.creator.LadderCreator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ladder.NaturalNumber.createNaturalNumber;
import static org.junit.jupiter.api.Assertions.*;

class LadderGameTest {
    LadderCreator ladderCreator;
    LadderGame ladderGame;

    @Test
    @DisplayName("사다리 만들기")
    @BeforeEach
    void makeLadder(){
        NaturalNumber row = createNaturalNumber(6);
        NaturalNumber numberOfPerson = createNaturalNumber(4);
        ladderCreator = new LadderCreator(row, numberOfPerson);
        ladderGame = new LadderGame(ladderCreator);
    }

    @Test
    @DisplayName("사다리타기 게임 실행")
    void run(){
        ladderGame.drawLine(new Position(createNaturalNumber(1), createNaturalNumber(3), this.ladderCreator));
        ladderGame.drawLine(new Position(createNaturalNumber(2), createNaturalNumber(4), this.ladderCreator));
        ladderGame.drawLine(new Position(createNaturalNumber(4), createNaturalNumber(4), this.ladderCreator));
        ladderGame.drawLine(new Position(createNaturalNumber(3), createNaturalNumber(2), this.ladderCreator));
        assertEquals(3, ladderGame.run(new LadderPlayPoint(2)));
    }
}