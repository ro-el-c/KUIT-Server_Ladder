package ladder.creator;

import ladder.Position;
import ladder.Row;

public interface LadderCreator {
    void drawLine(Position position);
    Row[] getRows();
    int getNumberOfFloors();
    int getNumberOfPerson();
}
