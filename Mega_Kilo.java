public class Mega_Kilo {
    public static void main(String args[])
    {
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(1124);
        printMegaBytesAndKiloBytes(0);
    }
    public static void printMegaBytesAndKiloBytes(int kb)
    {
        if(kb<0)
            System.out.println("Invalid value");
        else if(kb >= 0)
        {
            long result = (long)((long)kb/(long)1024.0);
            int rem = kb % 1024;
            System.out.println(kb+"KB = "+result+"MB and "+rem+"KB \n");
        }
        else if (kb == 0)
        {
            System.out.println(0+"KB = "+0+"MB and "+0+"KB \n");
        }
    }
}
