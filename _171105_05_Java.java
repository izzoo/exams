import java.util.Collections;
import java.util.Scanner;

public class _171105_05_Java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int width = 3*n+6;
        int height = 3+n+1;
        String empty = String.join("", Collections.nCopies(n," "));
        steam(n, width, "~");
        upDownHandle(width,"=");
    }


    static void steam(int in, int width, String symbol) {
        //int br = (in-6)/3;
        for(int i=1; i<=in; i++) {

            for (int j = 1 ;  j<=width ; j++) {
                if(j>in && j<=in+3) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }

    }

    static void upDownHandle(int width, String symbol) {

        for (int i = 1; i <=width-1 ; i++) {
            System.out.print(symbol);
        }
    }

}
