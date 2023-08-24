package tareasKarina.semana1.astediscos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        astediscos(n);
        sc.close();
    }

    static void astediscos(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i== n/2|| j==n/2|| j==n-i-1 || j==i)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
