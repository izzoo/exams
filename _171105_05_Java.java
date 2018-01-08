import java.util.Collections;
import java.util.Scanner;

public class _171105_05_Java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int width = 3*n+6;
        int height = 3+n+1;
        String empty = String.join("", Collections.nCopies(n," "));
        steam(n, width, "~", empty);
        upDownHandle(width,"=");
    }


    static void steam(int in, int width, String symbol, String a) {
        //int br = (in-6)/3;
        for(int i=1; i<=in; i++) {
            System.out.println(a);
            for (int j = 1 ;  j<=in ; j++) {
                System.out.print(symbol + " ");
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
