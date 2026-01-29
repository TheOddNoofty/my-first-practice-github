// make a simple program that has one bug in it.
public class Testing {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = a / b;
        System.out.println("Result: " + c);
    }
}