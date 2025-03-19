import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner ler = new Scanner(System.in); 
		Random numAleatorio = new Random();
		
		saldo = numAleatorio.nextInt(); //Gera um número alátorio qualquer e armazena em saldo.
		
		
		System.out.println("Por favor, digite o nome da Agencia");
		agencia = ler.nextLine();
		
		System.out.println("Por favor, digite seu nome de cliente");
		nomeCliente = ler.nextLine();
		
		System.out.println("Por favor digite o número Agencia");
		numero = ler.nextInt();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
		"sua agência é %s, conta %d e seu saldo de %.2fbr já está disponível para saque.", nomeCliente, agencia, numero, saldo);
		
	
	}

}
