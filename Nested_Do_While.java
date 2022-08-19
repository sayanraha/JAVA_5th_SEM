public class Nested_Do_While {
    public static void main(String[] args) {
        int a = 100;
        do {
            if (a < 100){
                System.out.println("We are within the first do-while loop.");
                System.out.println(a);
                a++;
            }
            else{
                System.out.println("Invalid value range.");
            }
            do{
                System.out.println("We are within the second do-while loop.");
                System.out.println(a);

            }while (false);
        }while (false);


    }
}
