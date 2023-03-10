package ladder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadderSizeTest {

    @Test
    void getter() {
        LadderSize ladderSize = LadderSize.create(NaturalNumber.createNaturalNumber(1), NaturalNumber.createNaturalNumber(1));
        assertEquals(1,ladderSize.getHeight());
        assertEquals(1,ladderSize.getNoOfPerson());
    }

}