package ladder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ladder.NaturalNumber.createNaturalNumber;
import static ladder.Position.*;
import static org.junit.jupiter.api.Assertions.*;

public class LadderTest {



    @Test
    @DisplayName("만들어진 사다리 이상의 사람 예외 처리")
    void nthOfPersonValidate() {
        //when
        NaturalNumber numberOfPerson = createNaturalNumber(3);
        NaturalNumber row = createNaturalNumber(1);
        Ladder ladder = new Ladder(row, numberOfPerson);

        //given
        Position position = createPosition(3);

        //then
        assertThrows(IllegalArgumentException.class,()->ladder.run(position));
    }

    @Test
    @DisplayName("1 -1 0 0 / 0 1 -1 0 / 1 -1 0 0")
    void threeRowTwoColWithLine() {
        //when
        NaturalNumber numberOfPerson = createNaturalNumber(4);
        NaturalNumber row = createNaturalNumber(3);
        Ladder ladder = new Ladder(row, numberOfPerson);

        ladder.drawLine(createPosition(0), createPosition(0));
        ladder.drawLine(createPosition(1),createPosition(1));
        ladder.drawLine(createPosition(2),createPosition(0));

        //given
        Position nthOfPerson = createPosition(0);

        //then
        assertEquals(2,ladder.run(nthOfPerson));

        //given
        nthOfPerson = createPosition(1);

        //then
        assertEquals(1,ladder.run(nthOfPerson));

        //given
        nthOfPerson = createPosition(2);

        //then
        assertEquals(0,ladder.run(nthOfPerson));
    }

}