package br.com.threeway;


import java.util.Scanner;

public class TestaConta {

	public static void main(String[] argv) {
		
		//objeto para ler dados da console, captura o que for digitado
		Scanner c = new Scanner(System.in);
		
	   //declara e inicializa saldo com valor digitado pelo usu�rio
	   System.out.println("Digite o saldo inicial da conta");
	   double saldoConta = c.nextDouble();
	   
	   //declara e inicializa o n�mero da conta digitado pelo usu�rio
	   System.out.println("Digite o numero da conta");
	   int numeroConta = c.nextInt();
	   
	   //Cria uma inst�ncia de ContaService onde est� presente as opera��es para Objeto Conta
	   ContaService operacoesConta = new ContaService();
	   
	   //Cria uma inst�ncia da classe Conta
	   Conta conta1 = new Conta();
	   
	   //Altera valor dos atributos da inst�ncia da classe Conta
	   conta1.setNumero(numeroConta);
	   conta1.setSaldo(saldoConta);
	   
	   //Nova inst�ncia de Conta para transfer�ncia
	   Conta conta2 = new Conta();
	   
	   //Nova inst�ncia de Conta para transfer�ncia
	   Conta conta3 = new Conta();
	   
	   
	   

	}

}
