package ladder;

public class LadderPlayPoint {
    private int playPoint;

    public LadderPlayPoint(int playPoint) {
        validatePlayPoint(playPoint);
        this.playPoint = playPoint;
    }

    private void validatePlayPoint(int playPoint) {
        if(playPoint<=0)
            throw new IllegalArgumentException("자연수는 1 이상입니다.");
    }

    public int getValue(){
        return this.playPoint;
    }

    public void plus(int plusNumber){
        this.playPoint += plusNumber;
    }
}
