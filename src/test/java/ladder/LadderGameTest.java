package ladder;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadderGameTest {
    LadderCreator ladderCreator;
    LadderGame ladderGame;

    @Test
    @DisplayName("사다리 만들기")
    @BeforeEach
    void makeLadder(){
        NaturalNumber row = new NaturalNumber(6);
        NaturalNumber numberOfPerson = new NaturalNumber(4);
        ladderCreator = new LadderCreator(row, numberOfPerson);
        ladderGame = new LadderGame(ladderCreator);
    }

    @Test
    @DisplayName("사다리타기 게임 실행")
    void run(){
        ladderGame.drawLine(new Position(new NaturalNumber(1), new NaturalNumber(3), this.ladderCreator));
        ladderGame.drawLine(new Position(new NaturalNumber(2), new NaturalNumber(4), this.ladderCreator));
        ladderGame.drawLine(new Position(new NaturalNumber(4), new NaturalNumber(4), this.ladderCreator));
        ladderGame.drawLine(new Position(new NaturalNumber(3), new NaturalNumber(2), this.ladderCreator));
        assertEquals(3, ladderGame.run(new LadderPlayPoint(2)));
    }
}