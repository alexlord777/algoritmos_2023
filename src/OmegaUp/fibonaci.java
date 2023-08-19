package OmegaUp;
import java.util.Scanner;
import java.math.BigInteger;

public class fibonaci {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number = scanner.nextBigInteger();

        System.out.println(findFibonacciPosition1(number));
    }

    static int fibonaciR(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonaciR(n - 2) + fibonaciR(n - 1);
        }
    }

    static int fibonaciI(int n) {

        int numero = 0;
        int n1 = 1;
        int n2 = 1;
        if (n == 1 || n == 2)
            return 1;
        for (int i = 0; i < n - 2; i++) {
            numero = n1 + n2;
            n1 = n2;
            n2 = numero;
        }

        return numero;
    }

    public static int findFibonacciPosition(long number) {
        if (number <= 0) {
            return -1; // No existe en la sucesión de Fibonacci
        }

        int a = 1, b = 1;
        int position = 2;

        if (number == 1)
            return 1;
        while (b < number) {
            int temp = b;
            b = a + b;
            a = temp;
            position++;
        }

        if (b == number) {
            return position;
        } else {
            return -1; // No existe en la sucesión de Fibonacci
        }
    }

    public static int findFibonacciPosition1(BigInteger number) {
        if (number.compareTo(BigInteger.ZERO) <= 0) {
            return -1; // No existe en la sucesión de Fibonacci
        }

        BigInteger a = BigInteger.ONE, b = BigInteger.ONE;
        int position = 2;

        if (number.equals(BigInteger.ONE)) {
            return 1;
        }

        while (b.compareTo(number) < 0) {
            BigInteger temp = b;
            b = a.add(b);
            a = temp;
            position++;
        }

        if (b.equals(number)) {
            return position;
        } else {
            return -1; // No existe en la sucesión de Fibonacci
        }
    }

}
