import java.util.Scanner;

public class SelecVet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A[] = new double[100];

		for(int i = 0; i < A.length; i++){
			A[i] = scan.nextDouble();
			if(A[i] <= 10)
				System.out.printf("A[%d] = %.1f%n", i, A[i]);
		}
	}
}