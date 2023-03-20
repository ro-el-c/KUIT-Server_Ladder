package ladder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {
    Ladder ladder;
    Position position;

    @Test
    @DisplayName("사다리 만들기")
    @BeforeEach
    void makeLadder(){
        ladder = new Ladder(6, 4);
    }

    @Test
    @DisplayName("사다리 만들기 유효성 검사")
    void checkLadder(){
        assertThrows(IllegalArgumentException.class, () -> new Ladder(3,3));
    }

    @Test
    @DisplayName("Position 유효성 검사")
    void isPositionRight(){
        assertThrows(IllegalArgumentException.class, () -> new Position(0,1, ladder));
        new Position(1,1, ladder);
    }

    @Test
    @DisplayName("사다리라인 만들기")
    void drawLine(){
        // position -> 사다리라인의 왼쪽 좌표
        position = new Position(1, 1, ladder);
        ladder.drawLine(position);

        // 사다리라인 만들고 해당 좌표에 Position 생성 유효성 검사
        assertThrows(IllegalArgumentException.class, () -> new Position(1,2, ladder));
    }

    @Test
    @DisplayName("사다리타기")
    void run(){
        ladder.drawLine(new Position(1, 0, ladder));
        ladder.drawLine(new Position(2, 2, ladder));
        ladder.drawLine(new Position(4, 1, ladder));
        assertEquals(1, ladder.run(3));
    }
}