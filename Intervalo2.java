import java.util.Scanner;

public class Intervalo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dentro = 0;
        int fora = 0;
        int i = 0;
        int num = scan.nextInt();

        while (i < num) {
            int a = scan.nextInt();
            if (10 <= a && a <= 20) {
                dentro++;
            } else {
                fora++;
            }
            i++;
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");

        scan.close();
    }
}
