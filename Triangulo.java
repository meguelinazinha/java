import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double l1, l2, l3;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite l1");
		l1 = leitor.nextDouble();
		
		System.out.println("Digite l2");
		l2 = leitor.nextDouble();
		
		System.out.println("Digite l3");
		l3 = leitor.nextDouble();
		
		if(l1==l3 && l1==l2 && l3==l2) {
			System.out.println("Equilátero");
		}
	}

}
