package br.com.jvsangue;

import java.util.Scanner;

public class Login {

	static void login() {

		String user = "admin";
		String senha = "admin";
		int opcao = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite seu usu�rio: ");
		user = leia.next(user);


		System.out.println("Digite sua senha: ");
		senha = leia.next(senha);

		if(user.equals(user) && senha.equals(senha)) {

			System.out.println("=========================  Login efetuado com sucesso =========================");
			System.out.println("\n  Por favor, selecione uma op��o:\n"
					+ "1) Come�ar question�rio \n"
					+ "2) Ver estat�sticas\n"
					);
			System.out.print("Op��o selecionada: ");
			opcao = leia.nextInt();

			if(opcao == 1) {
				//  Colocar metodo para ir ao question�rio
			}else if (opcao == 2){
				// Colocar metodo para ir � estatisticas
			}

		}else 
			System.out.println("Usu�rio ou senha incorreta!");


		leia.close();
	}

}
