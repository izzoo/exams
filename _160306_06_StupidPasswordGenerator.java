import java.util.Scanner;

public class _160306_06_StupidPasswordGenerator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int l = in.nextInt();


        for (int i = 1; i <= n; i++) {
            //System.out.print(i);
            for (int j = 1; j <=n ; j++) {
               // System.out.print(j);
                for (int k = 97; k < 97+l; k++) {
                    //System.out.print((char)k);
                    for (int m = 97; m <97+l ; m++) {
                        //System.out.print((char)m);
                        for (int o = 1; o<=n; o++) {
                            if(o>i && o>j) {
                                System.out.print("" + i + j);
                                System.out.print("" + (char) k);
                                System.out.print("" + (char) m);

                                System.out.print("" + o);
                                System.out.print(" ");
                            }
                            //System.out.print(" ");
                        }
                    }
                }
            }

        }
    }
}
