import java.util.Scanner;

public class Even_Odd_Sum{
    public static void main(String[] args) {
        System.out.println("Enter any digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum = 0, oddsum = 0;
        while(n != 0){
            int temp = n % 10;
            if(temp % 2 == 0){
                evensum += temp;
            }
            if(temp % 2 != 0){
                oddsum += temp;
            }
            n /= 10;
        }
        System.out.println("Evensum: "+evensum);
        System.out.println("Oddsum: "+oddsum);
    }
}