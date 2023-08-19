package tareasKarina.semana1.triangulo;
import java.util.Scanner;

public class main {
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        triangle(n);
    }

    static void triangle(int n)
    {
       for (int i = 0; i <n; i++) 
       {
          for (int j = 0; j <= i; j++) {
            System.out.print("*");
          }
          System.out.println("");
       }
    }
}
