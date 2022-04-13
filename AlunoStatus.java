import java.util.Scanner;

public class AlunoStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media, n1, n2 = 7.0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a Nota 1:");
		n1 = leitor.nextDouble();

		System.out.println("Digite a Nota 2:");
		n2 = leitor.nextDouble();

		media = (n1 + n2) / 2;

		if (media >10) {
			System.out.println("Entrada Inválida");
			System.exit(1);
		}

		if(media<0) {
			System.out.println("Entrada Inválida");
			System.exit(1);
		}

		if(media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}



	}




}