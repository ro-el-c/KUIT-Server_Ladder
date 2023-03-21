package ladder;

public class Position {
    Point x;
    Point y;
    // pointX의 범위

    public Position(int pointX, int pointY) {
        //validatePosition(pointX, pointY);
        //isLineExist(pointX, pointY);
        this.x = new Point(pointX);
        this.y = new Point(pointY);
    }

    /** TODO: 지울 validate 메서드
     * 음수를 Point 클래스에서 걸렀으므로, 각 최대 범위에 대한 validation 은 Ladder 클래스에서 진행한다.
     *
     // 사다리의 첫 줄(사람이 선택하는 수의 위치), 마지막 줄(결과 줄)에는 사다리 라인을 그을 수 없다고 가정
     private void validatePosition(int pointX, int pointY, Ladder ladder) {
     // 범위를 벗어나지 않는 좌표인지 검사
     // (수직) X 좌표, 즉, 사다리라인이 그어질 높이가 사다리보다 높으면 안됨 - 위 가정 하에, 0, 높이-1의 인덱스도 포함할 수 없음
     if (pointX >= ladder.getLadderLength()-1 || pointX <= 0) {
     System.out.println("X 좌표가 범위를 벗어났습니다.");
     throw new IllegalArgumentException();
     }
     // (수평) Y 좌표가 인원수-1보다 많거나 같으면 안됨 -> 이 좌표를 기준으로 !!오른쪽 수평!!으로 라인이 그어지기 때문에, Y 좌표에 제한이 걸림
     if (pointY >= ladder.getNumberOfPerson()-1 || pointY < 0) {
     System.out.println("Y 좌표가 범위를 벗어났습니다.");
     throw new IllegalArgumentException();
     }
     }*/

    /**TODO: 지울 validate 메서드
     * Position 은 사다리라인을 생성할 위치를 의미함
     * 따라서, 사다리 라인의 존재 여부는 사다리에서 하는게 맞음
     *
     private void isLineExist(int pointX, int pointY){
     // 이미 해당 좌표에 도착하는 사다리라인 혹은 출발하는 라인이 있는지 검사
     if(ladder.getValue(pointX, pointY) == 1) {
     System.out.println("해당 좌표에서 시작하는 사다리라인이 이미 있습니다.");
     throw new IllegalArgumentException();
     }
     if(ladder.getValue(pointX, pointY) == -1) {
     System.out.println("해당 좌표에서 끝이나는 사다리라인이 이미 있습니다.");
     throw new IllegalArgumentException();
     }
     }*/

    public int getX() {
        return x.getValue();
    }

    public int getY() {
        return y.getValue();
    }
}
