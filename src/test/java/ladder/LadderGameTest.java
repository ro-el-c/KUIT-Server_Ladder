package ladder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {
    LadderCreator ladderCreator;
    Ladder ladder;

    @Test
    @DisplayName("사다리 만들기 - Ladder")
    @BeforeEach
    void makeLadder(){
        ladderCreator = new LadderCreator(new NaturalNumber(6), new NaturalNumber(4));
        ladder = new Ladder(ladderCreator);
    }

    @Test
    @DisplayName("사다리라인 만들기 - drawLine")
    void drawLine(){
        ladder.drawLine(new Position(new NaturalNumber(1), new NaturalNumber(2), this.ladderCreator));

        // 이미 사다리 라인이 존재할 때, 생성할 수 없음
        assertThrows(IllegalArgumentException.class, () -> ladder.drawLine(new Position(new NaturalNumber(1), new NaturalNumber(2), this.ladderCreator)));
    }

    @Test
    @DisplayName("사다리타기 - run")
    void run(){
        ladder.drawLine(new Position(new NaturalNumber(1), new NaturalNumber(3), this.ladderCreator));
        ladder.drawLine(new Position(new NaturalNumber(2), new NaturalNumber(4), this.ladderCreator));
        ladder.drawLine(new Position(new NaturalNumber(4), new NaturalNumber(4), this.ladderCreator));
        ladder.drawLine(new Position(new NaturalNumber(3), new NaturalNumber(2), this.ladderCreator));
        assertEquals(3, ladder.run(new LadderPlayPoint(2)));
    }
}