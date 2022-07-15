package br.com.jvsangue;

import java.util.Scanner;

public class Questionario {

	private int genero;
	private int intervalo;
	private int continua;
	private int gravidez;
	private int periodo;
	private int parto;
	private int idade;



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
		if (intervalo == 2) {
			questionarioPermanente();
		}
		else {
			System.out.println("Para homens o intervalo m�nimo para realizar doa��o de sangue � de 2 meses. Infelizmente voc� n�o est� apto a realizar a doa��o."
					+ "Deseja continuar respondendo o question�rio? \n 1- Sim 2- N�o ");
			continua = leia.nextInt();
			if (continua == 2) {
				//menuiniciar metodo
			}
			questionarioPermanente();
		}

	}

	public void questionarioFem() {

		System.out.println("Voc� est� em per�odo gestacional?  \\n 1- Sim 2- N�o");
		gravidez = leia.nextInt();
		if (gravidez == 1) { 
			System.out.println("Voc� n�o est� apta a realizar a doa��o devido estar em per�odo gestacional. Deseja continuar respondendo o question�rio ?  \n 1- Sim 2- N�o");
			continua = leia.nextInt();
			if (continua == 2) {
				//metodo menu inicial
			}
		}
		System.out.println("Voc� esteve em per�odo gestacional nos �ltimos 12 meses? \\n 1- Sim 2- N�o");
		periodo = leia.nextInt();
		if (periodo == 1) {
			System.out.println("Caso tenha sido parto normal voc� deve aguardar 90 dias e 180 dias para cesariana e"
					+ "\n caso esteja amamentando deve aguardar 12 meses ap�s o parto para estar apta a realizar a doa��o, voc� se enquadra nestes requisitos?"
					+ "\n  1- Sim 2- N�o");
			parto = leia.nextInt();		
			if (parto == 1) {
				System.out.println("Infelizmente voc� n�o est� apta a realizar a doa��o no momento."
						+ " \n Deseja continuar respondendo? 1 - Sim 2 - N�o");
				continua = leia.nextInt();	
				if (continua == 2) {
					//metodo menu iniciar}
				}
			}
		}

		System.out.println("Doou sangue nos �ltimos 3 meses? \n 1- Sim 2- N�o ");
		intervalo = leia.nextInt();
		if (intervalo == 1) {
			System.out.println("Para mulheres o intervalo m�nimo para realizar doa��o de sangue � de 3 meses. Infelizmente voc� n�o est� apta a realizar a doa��o."
					+ "Deseja continuar respondendo o question�rio? \n 1- Sim 2- N�o ");
			continua = leia.nextInt();
			if(continua == 2) {
				//metodo menu iniciar
			}
			questionarioPermanente();
			}
		}


		public void questionarioPermanente() {
			System.out.println("Qual a sua idade? ");
			idade = leia.nextInt();
			

		}
	}
