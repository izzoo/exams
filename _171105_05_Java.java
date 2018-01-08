import java.util.Collections;
import java.util.Scanner;

public class _171105_05_Java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int width = 3*n+6;
        int height = 3*n+1;
        String empty = String.join("", Collections.nCopies(n," "));
        steam(n, width, "~");
        upDownHandle(width,"=");
        int handleHeight = n-2;
        Handle(width,handleHeight,n);
        upDownHandle(width,"=");
        coffee(width,n);
        upDownHandle(width-n+1,"=");

        //System.out.println(handleHeight/2);
    }


    static void steam(int in, int width, String symbol) {
        //int br = (in-6)/3;
        for(int i=1; i<=in; i++) {

            for (int j = 1 ;  j<=width ; j++) {
                if(j>in && j<in+3) {
                    System.out.print(symbol + " ");
                } else if(j<=in) {
                    System.out.print(" ");
                } else if(j==in+3) {
                    System.out.print(symbol);
                }
            }

            System.out.println("");
        }

    }

    static void upDownHandle(int width, String symbol) {

        for (int i = 1; i <=width-1 ; i++) {
            System.out.print(symbol);
        }
        System.out.println("");
    }

    static void Handle(int width, int handleHeight, int in) {
        for (int i = 0; i < handleHeight ; i++) {
            if(i==handleHeight/2){
                for (int k = 0; k <=in ; k++) {
                    if(k==0 ) {
                        System.out.print("|");
                    } else {
                        System.out.print("~");
                    }
                }
                System.out.print("JAVA");
                for (int k = 0; k <=in ; k++) {
                    if(k==in) {
                        System.out.print("|");
                    } else {
                        System.out.print("~");
                    }
                }

                for (int s = 1; s <= in; s++) {
                    if(s==in) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 1; j <= width; j++) {
                    if (j == 1 || j == in * 2 + 6 || j == width) {
                        System.out.print("|");
                    } else if (j > 1 && j < in * 2 + 6) {

                        System.out.print("~");

                    } else if (j > in * 2 + 6 || j < width) {

                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    static void coffee(int width, int in) {
        int a = 0;
        for (int i = in; i >0 ; i--) {
          // a++;
            
            for (int j = 0; j <in-i   ; j++) {

                    System.out.print(" ");

            }

            for (int k = 0; k <2*i+6  ; k++) {
                if(k==0){
                    System.out.print("\\");
                }
                else if(k==2*i+5) {
                    System.out.print("/");
                } else {

                    System.out.print("@");
                }
            }

            System.out.println("");
        }
    }

}


//================
//\@@@@@@@@@@/
//\@@@@@@@@@@@@@@/
//\@@@@@@@@@@@@@@@@@@@@/