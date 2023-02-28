package ladder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowTest {

    @Test
    @DisplayName("사다리 : 0")
    void OneColWithoutLine() {

        //when
        int numberOfPerson = 1;
        Row row = new Row(numberOfPerson);

        //given
        int nthOfPerson = 1;

        //then
        assertEquals(1, row.nextPosition(nthOfPerson));
    }

    @Test
    @DisplayName("사다리 : 11")
    void twoColWithLine() {

        //when
        int numberOfPerson = 2;
        Row row = new Row(numberOfPerson);
        row.drawLine(0);
        //given
        int nthOfPerson = 1;

        //then
        assertEquals(2, row.nextPosition(nthOfPerson));

        //given
        nthOfPerson = 2;

        //then
        assertEquals(1, row.nextPosition(nthOfPerson));
    }

    @Test
    @DisplayName("사다리 : 110")
    void oneRowThreeColWithLine() {
        //when
        int numberOfPerson = 3;
        Row row = new Row(numberOfPerson);

        row.drawLine(0);


        //given
        int nthOfPerson = 1;

        //then
        assertEquals(2, row.nextPosition(nthOfPerson));

        //given
        nthOfPerson = 2;

        //then
        assertEquals(1, row.nextPosition(nthOfPerson));

        //given
        nthOfPerson = 3;

        //then
        assertEquals(3, row.nextPosition(nthOfPerson));
    }

    @Test
    @DisplayName("사다리 사람이 0명인 경우 예외처리")
    void validateNumberOfPerson() {
        assertThrows(IllegalArgumentException.class, () -> new Row(0));
    }

    @Test
    @DisplayName("만들어진 사다리 이상의 사람 예외 처리")
    void nthOfPersonValidateOutOfRangeMAX() {
        //when
        int numberOfPerson = 3;
        Row row = new Row(numberOfPerson);

        //given
        int nthOfPerson = 4;

        //then
        assertThrows(IllegalArgumentException.class, () -> row.nextPosition(nthOfPerson));
    }

    @Test
    @DisplayName("1번째 이하의 사람 예외 처리")
    void nthOfPersonValidateOutOfRangeMIN() {
        //when
        int numberOfPerson = 3;
        Row row = new Row(numberOfPerson);

        //given
        int nthOfPerson = 0;

        //then
        assertThrows(IllegalArgumentException.class, () -> row.nextPosition(nthOfPerson));
    }


    @Test
    void ValidateDrawLinePositionOverRange() {
        //when
        int numberOfPerson = 3;
        Row row = new Row(numberOfPerson);

        //given

        int position = 3;

        //then
        assertThrows(IllegalArgumentException.class, () -> row.drawLine(position));

    }

    @Test
    void ValidateDrawLinePositionUnderRange() {
        //when
        int numberOfPerson = 3;
        Row row = new Row(numberOfPerson);

        //given

        int position = -1;

        //then
        assertThrows(IllegalArgumentException.class, () -> row.drawLine(position));
    }

    @Test
    void ValidateDrawLinePositionAlreadyHasLineLeft() {
        //when
        int numberOfPerson = 3;
        Row row = new Row(numberOfPerson);
        row.drawLine(0);

        //then
        assertThrows(IllegalArgumentException.class, () -> row.drawLine(1));
    }

    @Test
    void ValidateDrawLinePositionAlreadyHasLineRight() {
        //when
        int numberOfPerson = 3;
        Row row = new Row(numberOfPerson);
        row.drawLine(1);

        //then
        assertThrows(IllegalArgumentException.class, () -> row.drawLine(0));
    }
}