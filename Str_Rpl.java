public class Str_Rpl {
    public static void main(String[] args) {
        String name = "This is         a String";
        System.out.println(name);
        name = name.replace(" ", "_");
        System.out.println(name);
    }
}
