import java.util.Scanner;

public class Number_Power {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter the power value");
        int temp = 1;
        int n = sc.nextInt();
        while(n != 0){
            temp *= x;
            n--;
        }
        System.out.println("The result is: "+temp);
    }
}
