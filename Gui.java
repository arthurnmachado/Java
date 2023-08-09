import java.time.Period;
import java.time.LocalDate;
import java.util.Scanner;

public class Gui {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Insira o ano que você nasceu: ");
		int ano = scan.nextInt();
		System.out.printf("Insira o mês que você nasceu: ");
		int mes = scan.nextInt();
		System.out.printf("Insira o dia que você nasceu: ");
		int dia = scan.nextInt();
		scan.close();

		LocalDate niver = LocalDate.of(ano, mes, dia);
		LocalDate hoje = LocalDate.now();

		Period idade = Period.between(niver, hoje);
		System.out.printf("Você tem:%n%d ano(s)%n%d mes(es)%n%d dia(s)%n",
			idade.getYears(),
			idade.getMonths(),
			idade.getDays()
			);
	}
}