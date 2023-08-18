import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int par = 0, impar = 0, pos = 0, neg = 0;
        int i = 1;

        while (i <= 5) {
            double num = scan.nextDouble();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            }

            i++;
        }

        System.out.printf("%d valor(es) par(es)%n", par);
        System.out.printf("%d valor(es) impar(es)%n", impar);
        System.out.printf("%d valor(es) positivo(s)%n", pos);
        System.out.printf("%d valor(es) negativo(s)%n", neg);

        scan.close();
    }
}
