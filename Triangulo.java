import java.lang.Math;
import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();
		scan.close();

		if(a < b+c || b < a+c || c < a+b)
			System.out.printf("Perimetro = %.1f%n", a+b+c);
		else
			System.out.printf("Area = %.1f%n", (a+b)*c/2);
	}
}