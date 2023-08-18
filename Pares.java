import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int i = 1;

        while (i <= 5) {
            double num = scan.nextDouble();

            if (num % 2 == 0) {
                a++;
            }

            i++;
        }

        System.out.printf("%d valores pares%n", a);

        scan.close();
    }
}
