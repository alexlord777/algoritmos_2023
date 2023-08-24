package tareasKarina.semana1.adivina_numero;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroEnRango = random.nextInt(100); 

        int input= -1;

        while(input != numeroEnRango){
          System.out.print("#? ");
          input= sc.nextInt();

          if(input< numeroEnRango) System.out.println("> mayor");
          else if(input> numeroEnRango) System.out.println("> menor");
        }

        sc.close();
    }
}
