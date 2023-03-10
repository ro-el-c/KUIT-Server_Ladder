package ladder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void moveRight() {
        Node node = Node.createRightNode();

        Position position = Position.createPosition(0);

        node.move(position);

        assertEquals(1,position.getPosition());
    }

    @Test
    void moveCenter() {
        Node node = Node.createCenterNode();

        Position position = Position.createPosition(0);

        node.move(position);

        assertEquals(0,position.getPosition());
    }

    @Test
    void moveLeft() {
        Node node = Node.createLeftNode();

        Position position = Position.createPosition(1);

        node.move(position);

        assertEquals(0,position.getPosition());
    }

    @Test
    void appendSymbolRight() {
        Node node = Node.createRightNode();
        StringBuilder sb = new StringBuilder();
        node.appendSymbol(sb);
        assertEquals("1",sb.toString());
    }

    @Test
    void appendSymbolLeft() {
        Node node = Node.createLeftNode();
        StringBuilder sb = new StringBuilder();
        node.appendSymbol(sb);
        assertEquals("-1",sb.toString());
    }

    @Test
    void appendSymbolCenter() {
        Node node = Node.createCenterNode();
        StringBuilder sb = new StringBuilder();
        node.appendSymbol(sb);
        assertEquals("0",sb.toString());
    }

}