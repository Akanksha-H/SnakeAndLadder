public class LadderAndSnake {
    static final int LADDER = 0;
    static final int SNAKE = 1;

    public static void main(String[] args) {
        System.out.println("WELCOME_TO_THE_GAME");
        int diceRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
        int option = (int) (Math.floor(Math.random() * 10) % 3);
        int position = 0;

        switch (option) {
            case SNAKE:
                position -= diceRoll;
                System.out.println("You have got the snake, position = " + position);
                break;

            case LADDER:
                position += diceRoll;
                System.out.println("You have got the ladder, position  = " + position);
                break;

            default:
                System.out.println("You are at the same position = " + position);
        }
    }
}