import java.util.Scanner;

public class TrocaVet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N[] = new int[20];

		for(int i = 0; i < N.length; i++){
			N[i] = scan.nextInt();
		}

		int j = N.length-1, aux;
		for(int i = 0; i < (N.length/2); i++){
			aux = N[i];
			N[i] = N[j];
			N[j--] = aux;
		}

		for(int i = 0; i < N.length; i++)
			System.out.printf("N[%d] = %d%n", i, N[i]);
	}
}