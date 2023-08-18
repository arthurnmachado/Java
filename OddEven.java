import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            
            if (x == 0) {
                System.out.println("NULL");
            } else if (x % 2 == 0) {
                System.out.print("EVEN ");
                if (x > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            } else {
                System.out.print("ODD ");
                if (x > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }
        }
        
        scan.close();
    }
}
