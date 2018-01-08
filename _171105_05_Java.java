import java.util.Scanner;

public class _171105_05_Java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        steam(n, "~");
        upDownHandle(n,"=");
    }


    static void steam(int in, String symbol) {

        for(int i=1; i<=in; i++) {
            for (int j = in ; j <=in+3 ; j++) {
                System.out.print(symbol + " ");
            }

            System.out.println("");
        }

    }

    static void upDownHandle(int in, String symbol) {

        for (int i = 1; i <=in-1 ; i++) {
            System.out.print(symbol);
        }
    }

}
