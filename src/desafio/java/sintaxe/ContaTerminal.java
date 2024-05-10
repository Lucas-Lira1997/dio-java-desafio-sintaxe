package desafio.java.sintaxe;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
	public static void main(String[] args) {
		//TODO: Conhecer e importar a classe Scanner
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		//Exibir as mensagens para nosso usuário e obter os valores pela Scanner
		System.out.println("Qual é o seu nome? ");
		String cliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o número da agência: ");
		String numeroAgencia = scanner.nextLine();
		
		System.out.println("Agora digite o número da conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Digite o seu saldo atual: ");
		double saldo = scanner.nextDouble();
			
		//Exibir a mensagem conta criada
		System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco!");
		System.out.println("Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " reais está disponível para saque.");
		
		scanner.close();
	}
	
}
