public class FibonacciCalculator {

    // Calculates the nth fibonacci number
    public int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Checks whether the given number is part of the fibonacci sequence
    public boolean isInFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        int a = 0, b = 1, c = 0;
        while (b < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return b == n;
    }
}