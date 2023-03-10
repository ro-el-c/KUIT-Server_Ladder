package ladder;

public class LadderRunner {

    private final Row[] rows;

    public LadderRunner(Row[] rows) {
        this.rows = rows;
    }

    public int run(Position personPosition) {

        for (int i = 0; i < rows.length; i++) {
            System.out.println("Before");
            String generate = generate(LadderPosition.createLadderPosition(Position.createPosition(i), personPosition));
            System.out.println(generate);

            rows[i].nextPosition(personPosition);
            System.out.println("After");
            generate = generate(LadderPosition.createLadderPosition(Position.createPosition(i), personPosition));
            System.out.println(generate);
        }

        return personPosition.getPosition();
    }

    public String generate(LadderPosition ladderPosition) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows.length; i++) {
            rows[i].generateRow(sb, Position.createPosition(i), ladderPosition);
        }
        return sb.toString();
    }
}
