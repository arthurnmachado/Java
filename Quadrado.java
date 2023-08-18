import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int j;
        
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "^2 = ");
                j = i * i;
                System.out.println(j);
            }
        }
        
        scan.close();
    }
}
