import java.util.InputMismatchException;
import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
            System.out.println("Digite um numero maior que 0: ");
			int numero = scanner.nextInt();

			for (int ind = 1; ind <= numero; ind++) {
				for (int ind2 = numero - ind; ind2 > 0; ind2--) {
					System.out.print(" ");
				}
				System.out.println(linhas(ind));
			}
			scanner.close();
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida! Digite um número inteiro");
		}
	}

	public static String linhas(int qtdLinha) {
		String linha = "";

		if (qtdLinha < 0) {
			return "";
		}

		for (int ind = 0; ind < qtdLinha; ind++) {
			linha += "*";
		}

		return linha;
	}
}