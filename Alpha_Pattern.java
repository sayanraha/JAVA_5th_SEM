import java.util.*;

public class Alpha_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         char c =65;
         for (int i = 1; i <= N; i++){
            for (int j = 0; j < i; j++){
                System.out.print(c);
            }
            c++;
            System.out.println("");
         }
    }    
}
