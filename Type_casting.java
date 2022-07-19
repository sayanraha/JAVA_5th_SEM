public class Type_casting{
    public static void main(String args[]) {
        int age = 12;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println("Minimum value of integer:" + min + "\n" + "Maximum value of integer:" + max + "\n");

        //Underflow and Overflow
        System.out.println("Underflow:" +(min-1));
        System.out.println("Overflow:" +(max+1) + "\n");

        //byte data type; range -128 and 127
        //8 bytes
        byte minimumByte = Byte.MIN_VALUE;
        byte maximumByte = Byte.MAX_VALUE;
        System.out.println("Minimum value of byte:" + minimumByte + "\n" + "Maximum value of byte:" + maximumByte + "\n");

        //Short data type; range -32768 and 32768
        //16 bits
        short minimumShort = Short.MIN_VALUE;
        short maximumShort = Short.MAX_VALUE;
        System.out.println("Minimum value of Short:" + minimumShort + "\n" + "Maximum value of Short:" + maximumShort + "\n");

        //Short data type; range -32768 and 32768
        //16 bits

        long minimumLong = Long.MIN_VALUE;
        long maximumLong = Long.MAX_VALUE;
        System.out.println("Minimum value of long:" + minimumLong + "\n" + "Maximum value of long:" + maximumLong + "\n");

        //Casting
        byte byteNum = 124;
        byte newNum = (byte)(byteNum/2); //Casted int to byte, by default it gives int
        
        short shortNum = 468;
        short newShort = (short)(shortNum/2); //Casted int to Short, by default it gives int

        byte num01 = 12;
        byte num02 = 123;
        int num03 = 1234;
        long num04 = 50000L + 10L * (num01 + num02 + num03);

        System.out.println("Sum and multiplication:" +num04);

        short num05 = (short)(50000 + 10 * (num01 + num02 + num03));
        short testShort = Short.MAX_VALUE;

        System.out.println("Value after casting:" + num05);
        System.out.println("Maximum value of short:" +testShort);
    }
}