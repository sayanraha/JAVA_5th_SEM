import java.util.Scanner;

public class Switch_Decision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var = sc.next();

        switch (var){
            case "Arnab":
                System.out.println("Hello Arnab let us check your experience.");
                break;
            case "Soumya":
                System.out.println("Hello Soumya let us check your experience.");
                break;
            case "Ratul":
                System.out.println("Hello Ratul let us check your experience.");
                break;
            default:
                System.out.println("Sorry we don't have your details.");
        }

        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if (age >= 50){
            System.out.println("You are closing to your retirement.");
        }
        else if (age >= 40) {
            System.out.println("You in mid-level career.");
        }
        else if (age >= 30) {
            System.out.println("You are semi-experience.");
        }
        else{
            System.out.println("You are at early career stage.");
        }
    }
}
