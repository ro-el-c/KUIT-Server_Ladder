package ladder;

public class Position {
    private int pointX;
    private int pointY;
    // pointX의 범위

    public Position(int pointX, int pointY, Ladder ladder) {
        validatePosition(pointX, pointY, ladder);
        isLineExist(pointX, pointY, ladder);
        this.pointX = pointX;
        this.pointY = pointY;
    }

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
    }

    private void isLineExist(int pointX, int pointY, Ladder ladder){
        // 이미 해당 좌표에 도착하는 사다리라인 혹은 출발하는 라인이 있는지 검사
        if(ladder.getValue(pointX, pointY) == 1) {
            System.out.println("해당 좌표에서 시작하는 사다리라인이 이미 있습니다.");
            throw new IllegalArgumentException();
        }
        if(ladder.getValue(pointX, pointY) == -1) {
            System.out.println("해당 좌표에서 끝이나는 사다리라인이 이미 있습니다.");
            throw new IllegalArgumentException();
        }
    }

    public int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }
}
