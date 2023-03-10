package ladder;

import org.junit.jupiter.api.Test;

import static ladder.LadderPosition.*;
import static ladder.Position.*;
import static org.junit.jupiter.api.Assertions.*;

class LadderPositionTest {
    @Test
    void getter() {
        LadderPosition ladderPosition = createLadderPosition(createPosition(0), createPosition(0));
        assertEquals(0,ladderPosition.getColPosition());
        assertEquals(0,ladderPosition.getRowPosition());
        assertEquals(createPosition(0),ladderPosition.getRow());
        assertEquals(createPosition(0),ladderPosition.getCol());
    }

}