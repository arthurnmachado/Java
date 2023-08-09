import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vet[] = new int[10];

		for(int i = 0; i<vet.length; i++){
			vet[i] = scan.nextInt();
		}
		for(int i = vet.length-1; i >= 0; i--){
			System.out.printf(vet[i]+" ");
		}
		System.out.println();
		scan.close();
	}
}