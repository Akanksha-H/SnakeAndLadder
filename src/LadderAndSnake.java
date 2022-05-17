public class LadderAndSnake {
    public static void main(String[] args) {
        System.out.println("WELCOME_TO_THE_GAME");
        int diceRoll = (int) (Math.round(Math.random() * 10) % 6 + 1);
        String playerName = "Name = Annie";
        String playerId = "ID = ID562353";

        System.out.println(playerName);
        System.out.println(playerId);
        System.out.println(diceRoll);
    }
}