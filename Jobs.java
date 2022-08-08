
public class Jobs {
    int j1, j2, j3, j4;

    Jobs()// Default Constructor
    {
        j1 = 0;
        j2 = 0;
        j3 = 0;
        j4 = 0;
    }

    Jobs(int x)// Parameterized Constructor
    {
        j1 = x;
    }

    Jobs(int a, int b) {
        j2 = a;
        j3 = b;
    }

    Jobs(int w, int x, int y, int z) {
        j1 = w;
        j2 = x;
        j3 = y;
        j4 = z;
        System.out.println(" J1 J2 J3 J4 ");
        System.out.println(" "+j1+" "+j2+" "+j3+" "+j4);

       /*System.out.println("J1 is = " + j1);
        System.out.println("J2 is = " + j2);
        System.out.println("J3 is = " + j3);
        System.out.println("J4 is = " + j4);*/
    }

    public static void main(String args[]) {
        /* Constructor Overloading(types and number of parameters are different in each
         Constructor)*/
        Jobs ob1 = new Jobs();
        Jobs ob2 = new Jobs(20);
        Jobs ob3 = new Jobs(30, 40);
        Jobs ob4 = new Jobs(20, 30, 40, 50);
    }
}
