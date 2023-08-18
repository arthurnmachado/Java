import java.util.Scanner;

public class PreencheVet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] l = new int[10];
        int x = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            if (l.length == 0) {
                l[i] = x;
                System.out.printf("N[%d] = %d%n", i, l[i]);
            } else {
                l[i] = x;
                System.out.printf("N[%d] = %d%n", i, l[i]);
            }
            x *= 2;
        }

        scan.close();
    }
}
