import java.util.Scanner;

public class SomaImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int maior, menor;

        if (x > y) {
            maior = x;
            menor = y;
        } else {
            maior = y;
            menor = x;
        }

        menor++;

        int soma = 0;

        while (menor < maior) {
            if (menor % 2 != 0) {
                soma += menor;
            }
            menor++;
        }

        System.out.println(soma);

        scan.close();
    }
}
