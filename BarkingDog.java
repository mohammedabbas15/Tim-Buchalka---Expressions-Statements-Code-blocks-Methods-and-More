public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        // hour of day is 0-23
        //
        if(barking)
        {
            if(hourOfDay >= 0 && hourOfDay <= 8)
            {
                return true;
            }
            else if(hourOfDay == 23)
            {
                return true;
            }
        }
        return false;
    }
}