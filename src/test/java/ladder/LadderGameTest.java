package ladder;

import ladder.creator.LadderCreator;
import ladder.creator.CustomLadderCreator;
import ladder.creator.RandomLadderCreator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ladder.LadderSize.createLadderSize;
import static ladder.NaturalNumber.createNaturalNumber;
import static org.junit.jupiter.api.Assertions.*;

class LadderGameTest {
    LadderCreator ladderCreator;
    LadderGame ladderGame;

    @Test
    @DisplayName("사다리 만들기")
    @BeforeEach
    void makeLadder(){
        NaturalNumber row = createNaturalNumber(6);
        NaturalNumber numberOfPerson = createNaturalNumber(4);
        LadderSize ladderSize = createLadderSize(row, numberOfPerson);
        ladderCreator = new CustomLadderCreator(ladderSize); // 지정 사다리 타기 게임 실행 확인을 위하여 작성한 테스트 코드
        ladderGame = LadderGameFactory.createCustomLadderGame(ladderSize);
    }

    @Test
    @DisplayName("지정 사다리타기 게임 실행")
    void customLadderRun(){
        ladderCreator.drawLine(new Position(createNaturalNumber(1), createNaturalNumber(2), ladderCreator));
        ladderCreator.drawLine(new Position(createNaturalNumber(2), createNaturalNumber(3), ladderCreator));
        ladderCreator.drawLine(new Position(createNaturalNumber(4), createNaturalNumber(3), ladderCreator));
        ladderCreator.drawLine(new Position(createNaturalNumber(3), createNaturalNumber(1), ladderCreator));
        ladderGame = new LadderGame(ladderCreator);
        assertEquals(3, ladderGame.run(new LadderPlayPoint(2)));
    }

    @Test
    @DisplayName("랜덤 사다리타기 게임 실행")
    void radomLadderRun(){
        NaturalNumber row = createNaturalNumber(6);
        NaturalNumber numberOfPerson = createNaturalNumber(4);
        LadderSize ladderSize = createLadderSize(row, numberOfPerson);
        ladderGame = LadderGameFactory.createRandomLadderGame(ladderSize);
        System.out.println(ladderGame.run(new LadderPlayPoint(3)));
    }
}