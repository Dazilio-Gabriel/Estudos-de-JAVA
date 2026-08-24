package Estudos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lnOpcao;

		do {

			System.out.println("1 par");
			System.out.println("2 media");
			System.out.println("3 futuro");
			System.out.println("4 sair");
			System.out.print("digite uma opçao: ");

			lnOpcao = scanner.nextInt();

			switch (lnOpcao) {

			case 1:
				System.out.println("digite o numero para verificar par");
				int lnNum = scanner.nextInt();

				ehPar(lnNum);
				break;

			case 2:

				System.out.println("digite o numero a");
				double a = scanner.nextInt();
				System.out.println("digite o numero b");
				double b = scanner.nextInt();
				System.out.println("digite o numero c");
				double c = scanner.nextInt();

				calcularMedia(a, b, c);
				break;

			case 3:
				break;

			}

		} while (lnOpcao != 4);

		System.out.println("voce esta saindo do sistemas");
		scanner.close();
	}
	
	

	public static void calcularMedia(double a, double b, double c) {
		
		double media = (a + b + c) / 3;
		
		System.out.println("a media do aluno é= " + media);
		System.out.println();
		
	}

	public static boolean ehPar(int lNumUsua) {

		int lnNum = 0;

		if (lNumUsua % 2 == 0) {
			System.out.println("é par");
			System.out.println();
			return true;

		}
		System.out.println("nao é par");
		System.out.println();
		;
		return false;

	}

}
