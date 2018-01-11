import java.util.Locale;
import java.util.Scanner;

public class _160306_01_TrainingLab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
            double w = in.nextDouble();
            double h = in.nextDouble();

            if(h<3 || w<h || w>100) {
                System.out.println("Въведете коректни стойности");
            }

            int wcm =(int) (w*100);
            int hcm = (int) (h*100);

            int shirina = hcm-100;
            int buranared = shirina/70;
        System.out.println(buranared);

            int redove = wcm/120;
        System.out.println(redove);
            int brmesta = buranared*redove -3;

        System.out.println(brmesta);
    }
}
