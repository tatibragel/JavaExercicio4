package exercicio4;
//Crie uma classe chamada Conta com tr�s atributos: Numero da Conta, Saldo e Limite. 
//Acrescente alguns m�todos na classe Conta para realizar as opera��es de Deposito, Saque, 
//Impress�o de extrato e consulta do saldo dispon�vel. Depois, teste os m�todos definidos na classe Conta.


import java.util.Scanner;


public class resolucao {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);        
		System.out.println("Digite o numero da sua conta:");
        String usuario = sc.nextLine();
        
        
        
        if(usuario.equals("12125") || usuario.equals("13135")) {
        	
        	System.out.println("Bem-vindo!");
        	
        	System.out.println("Deseja acessar o menu, S ou N?");
        	String test = sc.nextLine();
        	
        	while(test.equals("S")) {
        		Menu menu = new Menu();
            	menu.MenuPrincipal(0);
            	test = "";
        	}       	
        	      	
        }else {
        	System.out.println("Conta n�o cadastrada, favor digitar conta novamente");
        }
        
                  
        sc.close(); 
	}
	

}
