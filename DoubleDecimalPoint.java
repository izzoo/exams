import java.text.DecimalFormat;
import java.util.Scanner;

public class DoubleDecimalPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //printf
        double n = 12.547456457;
        System.out.printf("Value: %.2f", n);
        System.out.println();

        //String format
        String result = String.format("%.2f", n);
        System.out.println(result);

        //Decimal format
        DecimalFormat df = new DecimalFormat("####0.00");
        System.out.println("Value: " + df.format(n));


        //Math round
        double m = Math.round(n*100);//100;
        System.out.println(m/100);
    }
}
