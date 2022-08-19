import java.util.Scanner;

public class Sum_Or_Product {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println("Mention any case where, if C is equal to :\n * 1, then print the sum,\n * 2, then print the product" +
                ",\n * Any other number , then print invalid");

        int C = sc.nextInt();
        int i, sum = 0, pro = 1;

        switch (C){
            case 1:
                for(i = 0; i <= N; i++){
                    sum = sum + i;
                }
                System.out.println(sum);
                break;
            case 2:
                for(i = 1; i <= N; i++){
                    pro = pro * i;
                }
                System.out.println(pro);
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
