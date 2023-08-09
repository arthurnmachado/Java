import java.util.Scanner;

public class Lanche {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cod = scan.nextInt(), qnt = scan.nextInt();
		scan.close();

		System.out.printf("Total: R$ ");
		if(cod == 1)
		System.out.printf("%.2f%n", (double) qnt*4);
		if(cod == 2)
		System.out.printf("%.2f%n", (double) qnt*4.5);
		if(cod == 3)
		System.out.printf("%.2f%n", (double) qnt*5);
		if(cod == 4)
		System.out.printf("%.2f%n", (double) qnt*2);
		if(cod == 5)
		System.out.printf("%.2f%n", (double) qnt*1.5);
	}
}