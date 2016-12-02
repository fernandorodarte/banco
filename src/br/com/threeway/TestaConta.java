package br.com.threeway;


import java.util.Scanner;

public class TestaConta {

	public static void main(String[] argv) {
		
		//objeto para ler dados da console, captura o que for digitado
		Scanner c = new Scanner(System.in);
		
	   //declara e inicializa saldo com valor digitado pelo usuário
	   System.out.println("Digite o saldo inicial da conta");
	   double saldoConta = c.nextDouble();
	   
	   //declara e inicializa o número da conta digitado pelo usuário
	   System.out.println("Digite o numero da conta");
	   int numeroConta = c.nextInt();
	   
	   //Cria uma instância de ContaService onde está presente as operações para Objeto Conta
	   ContaService operacoesConta = new ContaService();
	   
	   //Cria uma instância da classe Conta
	   Conta conta1 = new Conta();
	   
	   //Altera valor dos atributos da instância da classe Conta
	   conta1.setNumero(numeroConta);
	   conta1.setSaldo(saldoConta);
	   
	   //Nova instãncia de Conta para transferência
	   Conta conta2 = new Conta();
	   
	   //Nova instância de Conta para transferência
	   Conta conta3 = new Conta();
	   
	   
	   

	}

}
