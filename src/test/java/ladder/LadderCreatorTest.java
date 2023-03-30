package ladder;

import ladder.creator.LadderCreator;
import ladder.creator.CustomLadderCreator;
import ladder.creator.RandomLadderCreator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ladder.LadderSize.createLadderSize;
import static ladder.NaturalNumber.*;
import static org.junit.jupiter.api.Assertions.*;

class LadderCreatorTest {
    LadderCreator ladderCreator;

    @Test
    @DisplayName("사다리 만들기")
    @BeforeEach
    void makeLadder(){
        // when
        NaturalNumber row = createNaturalNumber(6);
        NaturalNumber numberOfPerson = createNaturalNumber(4);
        LadderSize ladderSize = createLadderSize(row, numberOfPerson);
        ladderCreator = new CustomLadderCreator(ladderSize);
    }

    @Test
    @DisplayName("사다리라인 만들기 유효성 검사")
    void drawLine(){
        // give
        NaturalNumber positionRow = createNaturalNumber(1);
        NaturalNumber positionCol = createNaturalNumber(2);
        Position position = new Position(positionRow, positionCol, this.ladderCreator);

        // then
        ladderCreator.drawLine(position);

        // then - 이미 사다리 라인이 존재할 때, 생성할 수 없음
        assertThrows(IllegalArgumentException.class, () -> ladderCreator.drawLine(position));
    }

    @Test
    @DisplayName("랜덤 사다리 만들기")
    void makeRandomLadder(){
        // when
        NaturalNumber row = createNaturalNumber(6);
        NaturalNumber numberOfPerson = createNaturalNumber(4);
        LadderSize ladderSize = createLadderSize(row, numberOfPerson);
        ladderCreator = new RandomLadderCreator(new CustomLadderCreator(ladderSize));
    }
}