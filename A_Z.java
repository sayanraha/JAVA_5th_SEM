import java.util.Scanner; 
public class A_Z {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check ");
        char ch = sc.next().charAt(0);
        //int res = (ch>=65 && ch<= 90)  1 ? (ch>=97 && ch<=122) : 0 ? -1;
        //System.out.print(res);
        if(ch >= 65 && ch<= 90)
        {
            System.out.println("1");
        }
        else if(ch >=97 && ch<=122){
            System.out.println("0");
        }
        else
        {
            System.out.println("-1");
        }
    }
}
