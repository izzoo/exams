import java.util.Scanner;

public class _171105_05_Java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        steam(n, "~");
    }


    static void steam(int in, String symbol) {

        for(int i=1; i<=in; i++) {
            for (int j = 1 ; j <=3 ; j++) {
                System.out.print(symbol);
            }

            System.out.println("");
        }

    };;;;;;;;;;;;;;;;;;;;;dada






}
