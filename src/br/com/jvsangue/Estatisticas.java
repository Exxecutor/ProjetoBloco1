package br.com.jvsangue;

import java.util.Scanner;

public class Estatisticas extends BancoEstatisticas {
	
	public static void mostraEstatistica() {
		
		Scanner input = new Scanner(System.in);
		
		// getName de Cadastro
		
		mostraEstGerais();
		
		System.out.println();
		System.out.println("Agora vamos ver alguns dados sobre o seu sangue."
						+ "\nPrimeiro, me diga qual seu tipo sangu�neo: ");
		
		System.out.println("(1) A+");
		System.out.println("(2) A-");
		System.out.println("(3) B+");
		System.out.println("(4) B-");
		System.out.println("(5) AB+");
		System.out.println("(6) AB-");
		System.out.println("(7) O+");
		System.out.println("(8) O-");
		System.out.println("(9) N�o sei");
		char opcao1 = input.next().charAt(0);
		
		switch(opcao1) {
		case '1':
			mostraAPositivo();
			break;
		case '2':
			mostraANegativo();
			break;
		case '3':
			mostraBPositivo();
			break;
		case '4':
			mostraBNegativo();
			break;
		case '5':
			mostraABPositivo();
			break;
		case '6':
			mostraABNegativo();
			break;
		case '7':
			mostraOPositivo();
			break;
		case '8':
			mostraONegativo();
			break;
		case '9':
			System.out.println("Veja como voc� pode descobrir seu tipo sangu�neo de duas formas diferentes:"
					+ "\n1) Fa�a um exame de sangue comum e pe�a para descobrir seu tipo sangu�neo;"
					+ "\n2) Responda nosso question�rio para descobrir se voc� est� apto a dor sangue,"
					+ "\npois ao doar voc� ficar� sabendo qual seu tipo e ainda ganha um cart�o de doador!");
		}
		
		System.out.println();
		System.out.println("Deseja retornar ao menu principal?");
		System.out.println("(1) Sim");
		System.out.println("(2) N�o");
		char opcao2 = input.next().charAt(0);
		
		switch (opcao2) {
		case '1':
			// retorna ao menu inicial
			break;
		case '2':
			System.out.println("Voc� saiu do programa.");
			System.exit(0);
			break;
		}
		input.close();
	}
}
