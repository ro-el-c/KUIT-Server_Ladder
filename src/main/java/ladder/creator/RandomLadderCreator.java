package ladder.creator;

import ladder.LadderPosition;
import ladder.LadderSize;
import ladder.Position;
import ladder.Row;
import ladder.creator.utils.NumberGenerator;
import ladder.creator.utils.RandomNumberGenerator;

import java.util.HashSet;

public class RandomLadderCreator implements LadderCreator {

    private final LadderSize ladderSize;
    private final CustomLadderCreator ladderCreator;
    private final NumberGenerator numberGenerator = new RandomNumberGenerator();


    public RandomLadderCreator(CustomLadderCreator ladderCreator) {
        this.ladderCreator = ladderCreator;
        this.ladderSize = ladderCreator.getLadderSize();
        drawLines();
    }

    private void drawLines() {
        HashSet<Integer> numbers = new HashSet<>();

        while (numbers.size() < numberOfLine()) {
            addNumber(numbers);
        }
    }

    private void addNumber(HashSet<Integer> numbers) {
        int number = numberGenerator.getNumber(0, ladderSize.getSize() - 1);
        LadderPosition linePosition = numberToLadderPosition(number);

        if (ladderCreator.getRow()[linePosition.getRowPosition()].canInstallLine(linePosition.getCol())) {
            numbers.add(number);
            ladderCreator.drawLine(linePosition);
        }
    }

    private LadderPosition numberToLadderPosition(int number) {

        Position row = Position.createPosition(number / ladderSize.getNoOfPerson());
        Position col = Position.createPosition(number % ladderSize.getNoOfPerson());

        return LadderPosition.createLadderPosition(row, col);
    }

    private int numberOfLine() {
        return (int) (ladderSize.getSize() * 0.3);
    }

    @Override
    public void drawLine(LadderPosition ladderPosition) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Row[] getRow() {
        return ladderCreator.getRow();
    }
}
