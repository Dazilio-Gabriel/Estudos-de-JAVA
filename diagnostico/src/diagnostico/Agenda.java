package diagnostico;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		Scanner loScan = new Scanner(System.in);
		VetContato loVetCont = new VetContato();

		int lnOpcao;

		do {

			System.out.println("1 cadastrar");
			System.out.println("2 consultar");
			System.out.println("3 imprimir");
			System.out.println("4 sair");
			System.out.print("digite uma opçao: ");

			lnOpcao = loScan.nextInt();
			loScan.nextLine();

			switch (lnOpcao) {

			case 1:
				cadastrar(loScan, loVetCont);
				break;

			case 2:
				consul(loScan, loVetCont);
				break;

			case 3:
				imprimir(loVetCont);
				break;

			case 4:
				System.out.println("saindo");
				break;

			default:
				System.out.println("opçao invalida");
			}

		} while (lnOpcao != 4);

		loScan.close();
	}

	public static void cadastrar(Scanner loScan, VetContato loVetCont) {

		System.out.print("digite o nomed ");
		String lsNome = loScan.nextLine();
		System.out.print("digite o telefone ");
		String lsTelefone = loScan.nextLine();

		Contato loCont = new Contato(lsNome, lsTelefone);
		int lnResultado = loVetCont.inse(loCont);

		if (lnResultado == 0) {
			System.out.println("contato cadastrado");
		} else if (lnResultado == -2) {
			System.out.println("erro contato ja cadastrado");
		} else if (lnResultado == -1) {
			System.out.println("erro agenda cheia");
		}
	}

	public static void consul(Scanner loScan, VetContato loVetCont) {

		System.out.print("digite o nome do contato: ");
		String lsNome = loScan.nextLine();
		int lnPosicao = loVetCont.pesc(lsNome);

		if (lnPosicao == -1) {
			System.out.println("contato nao encontrado");
		} else {
			Contato loCont = loVetCont.getContato(lnPosicao);
			System.out.println("nome " + loCont.getNome());
			System.out.println("telefone " + loCont.getTelefone());
		}
	}

	public static void imprimir(VetContato loVetCont) {

		for (int lnI = 0; lnI < loVetCont.getQuant(); lnI++) {
			Contato loCont = loVetCont.getContato(lnI);
			System.out.println("nome " + loCont.getNome());
			System.out.println("telefone " + loCont.getTelefone());
		}
	}

}