package ladder.creator;

import ladder.LadderSize;
import ladder.NaturalNumber;
import ladder.Position;
import ladder.Row;

import static ladder.NaturalNumber.createNaturalNumber;

public class RandomLadderCreator implements LadderCreator{
    // 사용자가 숫자를 지정하진 않지만, 결국 난수가 정해지면 CustomLadderCreator 사다리 생성

    private final LadderSize ladderSize;
    private final CustomLadderCreator ladderCreator;
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public RandomLadderCreator(CustomLadderCreator ladderCreator) {
        this.ladderCreator = ladderCreator;
        this.ladderSize = ladderCreator.getLadderSize();
        drawLines();
    }

    private void drawLines(){
        int lineCount=0;
        // TODO: 제약 조건에 의한 하드코딩 해결
        while(lineCount < totalLineNumber()){
            NaturalNumber row = createNaturalNumber(randomNumberGenerator.getRandomNumber(ladderCreator.getNumberOfFloors()-2));
            NaturalNumber col = createNaturalNumber(randomNumberGenerator.getRandomNumber(ladderCreator.getNumberOfPerson()-1));
            Position position = new Position(row, col, this.ladderCreator);

            try{
                ladderCreator.drawLine(position);
                lineCount++;
            } catch (IllegalArgumentException e){
            }
        }
    }

    private int totalLineNumber(){
        return (int)(ladderSize.getLadderSize() * 0.3);
    }

    @Override
    public void drawLine(Position position) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Row[] getRows() {
        return ladderCreator.getRows();
    }

    @Override
    public int getNumberOfFloors() {
        return ladderCreator.getNumberOfFloors();
    }

    @Override
    public int getNumberOfPerson() {
        return ladderCreator.getNumberOfPerson();
    }
}
