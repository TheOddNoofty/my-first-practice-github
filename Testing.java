// Program to test debugging - intentional bug for learning
public class Testing {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        System.out.println("Starting calculation...");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // This line has the bug (division by zero)
        int c = a / b;
        System.out.println("Result: " + c);
    }
}