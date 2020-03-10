public class CalcFeetAndInchesToCentimeters {
    public static double calFeetAndInchesToCentimeters(double feet, double inches)
    {
        if(feet >= 0 && inches >= 0 && inches <=12)
        {
            double centimeters = ((feet * 12) * 2.54) + (inches * 2.54);
            return centimeters;
        }
        return -1;
    }

    public static double calFeetAndInchesToCentimeters(double inches)
    {
        if(inches >= 0)
        {
            double feet = (int) inches / 12;
            double inch = (int ) inches % 12;
            return calFeetAndInchesToCentimeters(feet,inch);
        }
        return -1;
    }
}
