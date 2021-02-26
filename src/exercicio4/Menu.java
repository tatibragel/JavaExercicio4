package exercicio4;

import java.util.Scanner;

public class Menu {

	public void MenuPrincipal(int escolha) {

		Conta conta = new Conta();

		System.out.println("******Digite a opção desejada:******");
		System.out.println("* 1 - Consultar saldo              *");
		System.out.println("* 2 - Depositar                    *");
		System.out.println("* 3 - Sacar                        *");
		System.out.println("* 4 - imprimir extrato             *");
		System.out.println("* 5 - Sair                         *");
		System.out.println("************************************");
		
		
		Scanner es = new Scanner(System.in);
		escolha = es.nextInt();

		
		switch (escolha) {

		case 1:
						
			double saldoDisponivel = conta.consultaSaldoDisponivel();
			
			System.out.println("Saldo disponível:" + saldoDisponivel);
			System.out.println("");
			conta.retornaMenu();
			break;
		case 2:
			
			
			System.out.println("Digite o valor de deposito:");
			Scanner n = new Scanner(System.in);
			double valor = n.nextDouble();
	        conta.deposita(valor);
	       
			System.out.println("");
			conta.retornaMenu();
			
			break;

		case 3:
				
		
			System.out.println("Digite o valor do saque:");
			Scanner n2 = new Scanner(System.in);
			double  valor2 = n2.nextDouble(); 
		    conta.saque(valor2);
				
			System.out.println("");
			conta.retornaMenu();
			
			break;
			
		case 4:
				
			System.out.println("Seu extrato:");
								
			conta.impExtrato();		
						        				
			System.out.println("");
			conta.retornaMenu();				
		
			break;
		
		case 5:
				System.out.println("Adeus e até a próxima!");
				break;
				
			default:
				System.out.println("ERRO!!! DIGITE UM NUMERO VALIDO!");
				break;
			}

		es.close();
	
		
	
		
	}

}
