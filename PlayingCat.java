public class PlayingCat {
    // they play in temperatures of 25 to 35 (inclusive)
    // if its summer they play in an upper limit of 45(inclusive)
    // isCatPlaying boolean that has the parameters boolean summer and int temperature
    // return true if cat is playing false if not
    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        if(summer) // if its summer
        {
            if(temperature >= 25 && temperature <= 45) // upper limit
            {
                return true;
            }
        }
        else // if its not summer
        {
            if(temperature >= 25 && temperature <= 35)
            {
                return true;
            }
        }
        return false;
    }

}
