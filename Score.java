public class Score {
    public static int calculateScore(String playerName, int score)
    {
        System.out.println("player " + playerName + " scored " + score);
        return score*1000;
    }
    public static int calculateScore(int score)
    {
        System.out.println("player scored " + score);
        return score*1000;
    }
}
