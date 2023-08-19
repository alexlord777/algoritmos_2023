package tareasKarina.semana1.cuadrado;
import java.util.Scanner;;

public class main {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        square(n);
    }

    static void square(int n){
        for (int i = 0; i <n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
             System.out.print("*");   
            }
            System.out.println(" ");
            
        }
    }
}
