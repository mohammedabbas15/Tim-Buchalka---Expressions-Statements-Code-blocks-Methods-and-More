public class SecondsAnMinutesChallege
{
    public static String getDurationString(long minutes, long seconds)
    {
        if(minutes < 0 || seconds < 0 || seconds > 59)
        {
            return "invalid Value";
        }
        long hours = minutes / 60;
        long remMinutes = minutes % 60;
        return hours + "h " + remMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds)
    {
        if(seconds < 0)
        {
            return "Invalid Value";
        }

        long mins = seconds / 60;
        long sec = seconds % 60;
        return getDurationString(mins,sec);
    }
}
