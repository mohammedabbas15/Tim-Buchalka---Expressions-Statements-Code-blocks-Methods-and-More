public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        // from kilobytes to megabytes
        // 1 MB = 1024 KB
        if(kiloBytes < 0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            double megabytes = (double)(kiloBytes / 1024);
            double remainder = (double) (kiloBytes % 1024);
            System.out.println(remainder);
            System.out.println(megabytes);
        }
    }
}
