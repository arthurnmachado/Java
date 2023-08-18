import java.util.Scanner;

public class PosMed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 0;
        int i = 1;
        double soma = 0.0;
        double media = 0.0;

        while (i <= 6) {
            double num = scan.nextDouble();

            if (num > 0) {
                a++;
                soma += num;
            }

            media = soma / a;
            i++;
        }

        System.out.printf("%.0f valores positivos%n", a);
        System.out.printf("%.1f%n", media);

        scan.close();
    }
}