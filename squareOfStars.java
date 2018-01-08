import java.util.Scanner;

public class squareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String falr ="";

        for (int i = 1; i <= n ; i++) {
            if(i==1 || i==n){
                falr = falr + "*";
            }


            System.out.println(falr);
        }
    }
}
