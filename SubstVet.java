import java.util.Scanner;

public class SubstVet {
    public static void substitui(int[] l) {
        for (int i = 0; i < l.length; i++) {
            if (l[i] <= 0) {
                l[i] = 1;
            }
        }
    }

    public static void imprime(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("X[%d] = %d%n", i, x[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] l = new int[10];

        for (int i = 0; i < 10; i++) {
            l[i] = scan.nextInt();
        }

        substitui(l);
        imprime(l);

        scan.close();
    }
}
