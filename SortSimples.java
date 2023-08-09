import java.util.Scanner;

public class SortSimples {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vet[] = new int[3], vaux[] = new int[3], aux;

		for(int i = 0; i < vet.length; i++)
			vet[i] = scan.nextInt();
		for(int i = 0; i < vet.length; i++)
			vaux[i] = vet[i];
		scan.close();

		for(int i = 0; i < vet.length-1; i++){
			for(int j = i+1; j < vet.length; j++){
				if(vet[i] > vet[j]){
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		for(int i = 0; i < vet.length; i++)
			System.out.println(vet[i]);
		System.out.println();
		for(int i = 0; i < vet.length; i++)
			System.out.println(vaux[i]);

	}
}