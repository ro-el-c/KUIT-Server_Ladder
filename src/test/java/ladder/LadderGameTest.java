package ladder;

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
    @DisplayName("사다리라인 만들기 - drawLine")
    void drawLine(){
        NaturalNumber positionRow = new NaturalNumber(1);
        NaturalNumber positionCol = new NaturalNumber(2);
        Position position = new Position(positionRow, positionCol, this.ladderCreator);
        ladderGame.drawLine(position);

        // 이미 사다리 라인이 존재할 때, 생성할 수 없음
        assertThrows(IllegalArgumentException.class, () -> ladderGame.drawLine(position));
    }

    @Test
    @DisplayName("사다리타기 - run")
    void run(){
        ladderGame.drawLine(new Position(new NaturalNumber(1), new NaturalNumber(3), this.ladderCreator));
        ladderGame.drawLine(new Position(new NaturalNumber(2), new NaturalNumber(4), this.ladderCreator));
        ladderGame.drawLine(new Position(new NaturalNumber(4), new NaturalNumber(4), this.ladderCreator));
        ladderGame.drawLine(new Position(new NaturalNumber(3), new NaturalNumber(2), this.ladderCreator));
        assertEquals(3, ladderGame.run(new LadderPlayPoint(2)));
    }
}