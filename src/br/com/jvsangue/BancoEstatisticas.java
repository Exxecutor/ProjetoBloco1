package br.com.jvsangue;

public class BancoEstatisticas {
	

	public static void mostraEstGerais() {
		System.out.println("========================================================");
		System.out.println("==ESTAT�STICAS GERAIS SOBRE DOA��O DE SANGUE NO BRASIL==");
		System.out.println("========================================================");
		System.out.println();
		
		System.out.println("Voc� sabia que uma doa��o de sangue pode salvar at� 4 vidas?"
						+ "\nAl�m de ajudar pessoas que precisam de sangue para procedimentos"
						+ "\ne interven��es m�dicas, voc� tamb�m ajuda pessoas com doen�as" 
						+ "\ncr�nicas graves que precisam de transfus�es recorrentes.");
		
		System.out.println();
		System.out.println("Al�m disso, uma pessoa adulta tem em m�dia 5 litros de sangue"
						+ "\ne em cada doa��o o m�ximo de sangue retirado � de 450ml.");
		
		System.out.println();
		System.out.println("Mas infelizmente� menos de 2% dos brasileiros doam sangue.");
		
		System.out.println();
		System.out.println("Segundo uma pesquisa mundial feita pela farmac�utica Abbott," 
						+ "\no motivo das pessoas n�o doarem � n�o saberem como doar e "
						+ "\nterem medo do procedimento.");
		
		System.out.println();
		System.out.println("Como voc� chegou at� aqui, significa que quer doar e com" 
						+ "\ncerteza tem amigos e familiares aptos a doarem tamb�m, "
						+ "\nent�o compartilhe este programa para o m�ximo de pessoas que puder!");
	}
	
	public static void mostraAPositivo() {
		System.out.println("Voc� pode doar para pessoas com sangue AB+ e A+, e pode receber sangue "
				+ "\nde pessoas A+, A-, O+ e O-. De acordo com o hemocentro Pr�-Sangue de S�o Paulo, "
				+ "\no estoque de sangue A+ est� EST�VEL no momento, ufa! Mas n�o significa que ficar� "
				+ "\nassim para sempre, ent�o responda nosso question�rio para saber se voc� pode ser doador.");
	}
	
	
	public static void mostraANegativo() {
		System.out.println("Voc� pode doar para pessoas com sangue A+, A-, AB+ e AB-, e pode receber sangue "
				+ "\nde pessoas A- e O-. De acordo com o hemocentro Pr�-Sangue de S�o Paulo, o estoque de sangue "
				+ "\nA- est� EM ALERTA, ent�o que tal responder o question�rio para saber se voc� pode doar?");
	}
	
	public static void mostraBPositivo() {
		System.out.println("Voc� pode doar para pessoas com sangue B+ e AB+, e pode receber sangue de pessoas "
				+ "\nB+, B-, O+ e O-. De acordo com o hemocentro Pr�-Sangue de S�o Paulo, o estoque de sangue B+ "
				+ "\nest� EST�VEL no momento, ufa! Mas n�o significa que ficar� assim para sempre, ent�o responda "
				+ "\nnosso question�rio para saber se voc� pode ser doador.");
	}
	
	public static void mostraBNegativo() {
		System.out.println("Voc� pode doar para pessoas com sangue B+, B-, AB+ e AB-, e pode receber de pessoas "
				+ "\nB- e O-. De acordo com o hemocentro Pr�-Sangue de S�o Paulo, o estoque de sangue B- est� "
				+ "\nEM ESTADO CR�TICO, portanto vamos agilizar seu question�rio para que voc� possa saber se pode doar!");
	}
	
	public static void mostraABPositivo() {
		System.out.println("Voc� s� pode doar para pessoas com sangue AB+, mas pode receber de todos os outros "
				+ "\ntipos sangu�neos, por isso � conhecido como receptor universal. De acordo com o hemocentro "
				+ "\nPr�-Sangue de S�o Paulo, o estoque de sangue AB+ est� EST�VEL no momento, ufa! Mas n�o significa "
				+ "\nque ficar� assim para sempre, ent�o responda nosso question�rio para saber se voc� pode ser doador.");
	}
	
	public static void mostraABNegativo() {
		System.out.println("Voc� pode doar para pessoas com sangue AB+ e AB-, e pode receber de pessoas "
				+ "\nA-, B-, O- e AB-. De acordo com o hemocentro Pr�-Sangue de S�o Paulo, o estoque de sangue AB- est� "
				+ "\nEST�VEL no momento, ufa! Mas n�o significa que ficar� assim para sempre, ent�o responda nosso "
				+ "\nquestion�rio para saber se voc� pode ser doador.");
	}
	
	public static void mostraOPositivo() {
		System.out.println("Voc� pode doar para pessoas com sangue A+, B+, O+ e AB+, e pode receber de pessoas O+ e O-. "
				+ "\nDe acordo com o hemocentro Pr�-Sangue de S�o Paulo, o estoque de sangue O+ est� EM ESTADO CR�TICO, "
				+ "\nportanto vamos agilizar seu question�rio para que voc� possa saber se pode doar!");
	}
	
	public static void mostraONegativo() {
		System.out.println("Voc� pode doar para pessoas com todos os tipos sangu�neos e � conhecido como doador universal,"
				+ "\nmas s� pode receber de pessoas com sangue O-. De acordo com o hemocentro Pr�-Sangue de S�o Paulo, o "
				+ "\nestoque de sangue O- est� EM ESTADO CR�TICO, portanto vamos agilizar seu question�rio para que voc� "
				+ "\npossa saber se pode doar!");
	}
	

}
