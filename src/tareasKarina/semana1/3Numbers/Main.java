
import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

    }

    static String order3Numbers(int a, int b , int c)
    {
         if(a>=b)
         {
             if(a>b){
                if(b>c) return a+" > "+b+" >"+c;
                else return a+" >"+ "("+b+" "+c+")";
             }else{
                if(b>c) return "("+b+" "+a+")"+" > "+ c;
                else return c+" >"+ "("+b+" "+a+")";
             }
         }else{
            if(a>c)return b+" > "+a+" >"+c;
            else{
                if(a<c) return b+" > "+c+" >"+a;
                else return b+" >"+ "("+c+" "+a+")";
            }
         }
    }
}