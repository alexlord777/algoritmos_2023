package OmegaUp;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class alicia 
{
    public static void main(String[]arg)
    {
        List<Integer> chapas = new ArrayList<>();
        List<Integer> llaves = new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        int Nchapas=sc.nextInt();

        for (int i = 0; i < Nchapas; i++) 
        {
            int n= sc.nextInt();
            chapas.add(n);
        }

        int Nllaves=sc.nextInt();

        for (int i = 0; i < Nllaves; i++) {
            int n= sc.nextInt();
            llaves.add(n);
        }

        for (Integer i : llaves)
        {
            System.out.print( chapas.indexOf(i) +" ");
        }

        sc.close();

    }


    static int binarSearch(List<Integer>a, int n, int min, int max) {


        int med = ((min + max) / 2) ;
        if (min > max) {
            return 0;
        }
        if (n ==a.get(med)) {
            a.remove(med);
            return med+1;
        }
        if (n < a.get(med)) {
            return binarSearch(a, n, min, med-1);
        }
        if (n > a.get(med)) {
            return binarSearch(a, n, med+1, max);
        }
        return 0;
    }
    
}
