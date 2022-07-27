import  java.util.Scanner;

public class STF {
    public static void main(String[] args) {
        String name = new String("PCC-CS593 \n");
        System.out.print("The paper cade is: ");
        System.out.print(name);
        String a = "Odd semester 2022 \n";
        System.out.print(a);
        String b = "AIML & iOT \n";
        System.out.format("OOP Lab for: ");
        System.out.print(b);
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(st);
        System.out.println(st.charAt(2));
    }
}
