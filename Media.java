import java.util.Scanner;
import java.util.Locale;

public class Media {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		scan.close();

		double m = ((a*3.5)+(b*7.5))/11;
		System.out.printf("MEDIA = %.5f%n", m);
	}
}