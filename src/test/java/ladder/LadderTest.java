package ladder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LadderTest {



    @Test
    @DisplayName("만들어진 사다리 이상의 사람 예외 처리")
    void nthOfPersonValidate() {
        //when
        int numberOfPerson = 3;
        Ladder ladder = new Ladder(1, numberOfPerson);

        //given
        int nthOfPerson = 4;

        //then
        assertThrows(IllegalArgumentException.class,()->ladder.run(nthOfPerson));
    }

    @Test
    @DisplayName("1 -1 0 0 / 0 1 -1 0 / 1 -1 0 0")
    void threeRowTwoColWithLine() {
        //when
        int numberOfPerson = 4;
        int row = 3;
        Ladder ladder = new Ladder(row, numberOfPerson);

        ladder.drawLine(0,0);
        ladder.drawLine(1,1);
        ladder.drawLine(2,0);

        //given
        int nthOfPerson = 0;

        //then
        assertEquals(2,ladder.run(nthOfPerson));

        //given
        nthOfPerson = 1;

        //then
        assertEquals(1,ladder.run(nthOfPerson));

        //given
        nthOfPerson = 2;

        //then
        assertEquals(0,ladder.run(nthOfPerson));
    }

}