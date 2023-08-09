import java.util.Scanner;

public class SelecaoUm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), d = scan.nextInt();
		scan.close();

		if(b>c && d>a && c+d>a+b && c>0 && d>0 && a%2 == 0)
			System.out.println("Valores aceitos");
		else
			System.out.println("Valores nao aceitos");
	}
}