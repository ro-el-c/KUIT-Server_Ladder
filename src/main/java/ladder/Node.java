package ladder;

public class Node {
    private Direction direction;

    private Node(Direction direction) {
        this.direction = direction;
    }

    public static Node createRightNode(){ return new Node(Direction.RIGHT); }

    public static Node createLeftNode(){
        return new Node(Direction.LEFT);
    }

    public static Node createDownNode(){
        return new Node(Direction.DOWN);
    }

    public boolean isRight(){
        return direction.equals(Direction.RIGHT);
    }

    public boolean isLeft(){
        return direction.equals(Direction.LEFT);
    }
}
