public class Main 
    public static void main(String[] args) {

       int a=12, b=13;

        System.out.println("--Before swap--");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("--After swap--");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
