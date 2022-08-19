import java.util.Scanner;

public class Term_Of_AP {
    public static void main(String[] args) {
        System.out.print("Enter number of terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; count < n; i++) {
            int ap = 3*i+2;
            if(ap % 4 != 0){
                System.out.println(ap);
                count++;
            }
        }
    }
}
