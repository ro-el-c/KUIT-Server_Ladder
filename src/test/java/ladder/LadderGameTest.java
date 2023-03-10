package ladder;

import ladder.creator.CustomLadderCreator;
import ladder.creator.LadderCreator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ladder.NaturalNumber.createNaturalNumber;
import static ladder.Position.*;
import static org.junit.jupiter.api.Assertions.*;

public class LadderGameTest {



    @Test
    @DisplayName("만들어진 사다리 이상의 사람 예외 처리")
    void nthOfPersonValidate() {
        //when
        NaturalNumber numberOfPerson = createNaturalNumber(3);
        NaturalNumber row = createNaturalNumber(1);
        LadderSize ladderSize = LadderSize.create(row, numberOfPerson);
        LadderCreator ladderCreator = new CustomLadderCreator(ladderSize);
        LadderGame ladderGame = new LadderGame(ladderCreator);


        //given
        Position position = createPosition(3);

        //then
        assertThrows(IllegalArgumentException.class,()-> ladderGame.run(position));
    }

    @Test
    @DisplayName("1 -1 0 0 / 0 1 -1 0 / 1 -1 0 0")
    void threeRowTwoColWithLine() {
        //when
        NaturalNumber numberOfPerson = createNaturalNumber(4);
        NaturalNumber row = createNaturalNumber(3);
        LadderSize ladderSize = LadderSize.create(row, numberOfPerson);
        LadderCreator ladderCreator = new CustomLadderCreator(ladderSize);

        LadderGame ladderGame = new LadderGame(ladderCreator);

        ladderCreator.drawLine(LadderPosition.createLadderPosition(createPosition(0), createPosition(0)));
        ladderCreator.drawLine(LadderPosition.createLadderPosition(createPosition(1),createPosition(1)));
        ladderCreator.drawLine(LadderPosition.createLadderPosition(createPosition(2),createPosition(0)));

        //given
        Position nthOfPerson = createPosition(0);

        //then
        assertEquals(2, ladderGame.run(nthOfPerson));

        //given
        nthOfPerson = createPosition(1);

        //then
        assertEquals(1, ladderGame.run(nthOfPerson));

        //given
        nthOfPerson = createPosition(2);

        //then
        assertEquals(0, ladderGame.run(nthOfPerson));
    }

    @Test
    @DisplayName("Random")
    void randomLadderTest() {

        //when
        int numberOfPerson = 5;
        int row = 10;
        LadderGame ladderGame = LadderGameFactory.randomLadderGame(LadderSize.create(createNaturalNumber(row), createNaturalNumber(numberOfPerson)));

        ladderGame.run(createPosition(0));
    }

}