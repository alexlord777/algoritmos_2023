package tareasKarina.semana1.cruz;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        x(n);
        sc.close();
    }

    static void x(int n)
    {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==n-i-1 || j==i)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
