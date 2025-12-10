
    public class FactorialSimple {

    // Recursive method
    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;  // base case
        }
        return n * factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {

        int num = 10;   // you can change the number here
        int result = factorial(num);

        System.out.println("Factorial of " + num + " is: " + result);
    }
}



