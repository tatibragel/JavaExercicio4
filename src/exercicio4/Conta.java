package exercicio4;


public class Conta {
	//Acrescente alguns métodos na classe Conta para realizar as operações de Deposito, Saque, 
	//Impressão de extrato e consulta do saldo disponível.
	double valor, valor2;
	double saldo;
	double limite = 150.00;
	
	
	
		
	 public void deposita (double valor) {
         	
		 	
		 	this.saldo = limite;
	        this.saldo += valor;
	       
	        System.out.println("Voce depositou: " + valor);
	        System.out.println("saldo atual: " + this.saldo); 
	     
	    }
	     
	   public void saque (double valor2) {
	       
		   
		   this.saldo = limite;
	       this.saldo -= valor2;
	    	
	       
	    	System.out.println("Voce sacou: " + valor2);
	        System.out.println("Saldo atual: " + this.saldo ); 
	       
	    }
	     
	     
	    public void impExtrato (){
	       
	    	this.saldo = valor + valor2;
	    	System.out.println("Extrato: ");
	    	System.out.println("Seu saldo e de: " + this.saldo);
	    	System.out.println("Seu saldo com limite: " + (this.saldo + limite));
	       
	    }
	     
	    double consultaSaldoDisponivel (){
	         //arrumar
	        return this.saldo + this.limite ;
	    }
	    
	    void retornaMenu() {
	    	Menu menu = new Menu();
	    	menu.MenuPrincipal(0);
	    }
}

