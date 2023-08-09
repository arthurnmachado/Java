import java.util.Scanner;


public class Soma {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();

		int X = A + B;

		System.out.println("X = " + X);
	}
}