package br.com.jvsangue;

import java.util.Scanner;

public class Questionario {

	private int genero;
	private int intervalo;
	private int continua;
	private int gravidez;


	Scanner leia =  new Scanner(System.in);

	public void realizarQuestionario() {
		System.out.println("Qual o seu g�nero? \n 1 - Feminino, 2- Masculino, 3- Prefiro n�o informar. ");
		genero = leia.nextInt();
		if (genero == 1 || genero == 3) {

			questionarioFem();
		}
		else {
			questionarioMasc();
		}
	}

	public void questionarioMasc() {
		System.out.println("Doou sangue nos �ltimos 2 meses? \n 1- Sim 2- N�o ");
		intervalo = leia.nextInt();
		if (intervalo == 1) {
			questionarioPermanente();
		}
		else {
			System.out.println("Para homens o intervalo m�nimo para realizar doa��o de sangue � de 2 meses. Infelizmente voc� n�o est� apto a realizar a doa��o."
					+ "Deseja continuar respondendo o question�rio? \n 1- Sim 2- N�o ");
			continua = leia.nextInt();
			if (continua == 1) {
				questionarioPermanente();
			}
			else {
				//MenuInicial.menu(); Colocar m�todo menu inicial.
			}
		}

	}

	public void questionarioFem() {
		System.out.println("Doou sangue nos �ltimos 3 meses? \n 1- Sim 2- N�o ");
		intervalo = leia.nextInt();
		if (intervalo == 1) {
			questionarioPermanente();
		}
		else {
			System.out.println("Para mulheres o intervalo m�nimo para realizar doa��o de sangue � de 3 meses. Infelizmente voc� n�o est� apta a realizar a doa��o."
					+ "Deseja continuar respondendo o question�rio? \n 1- Sim 2- N�o ");
			continua = leia.nextInt();
			if (continua == 1) {
				System.out.println("Est� em per�odo gestacional? \n 1- Sim 2- N�o ");
				gravidez = leia.nextInt();
				if (gravidez == 1) {
					System.out.println("Voc� n�o est� apta a realizar a doa��o. Devido a estar em per�odo gestacional.");
				}
			}
			else {
				//MenuInicial.menu(); Colocar m�todo menu inicial.

			}
		}
		}
		public void questionarioPermanente() {

		}
	}
