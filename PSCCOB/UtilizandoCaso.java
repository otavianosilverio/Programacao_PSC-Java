package PSCCOB;
import java.util.*;
public class UtilizandoCaso {

	public static void main(String[] args) {
		 int opcao;    
		    Scanner ler = new 
		    Scanner(System.in);
		  
		    System.out.println("--------Menu-------:");
		    System.out.println("1 - Emitir Relatorios");
		    System.out.println("2 - Calcular Salario");
		    System.out.println("3 - Sair");
		    opcao = ler.nextInt();
		    switch (opcao){
	        case 1:
	        
			System.out.println("emitindo relatorio");
	        break;
			
	        case 2:
			
	        System.out.println("Calculando....");
	        break;
			
	        case 3:
	        System.out.println("Sair");
	        break;
	        
	        default:
	        	 System.out.println("Opcao Invalida");
	 	        break;
	        	
	        
		      }      
		

	}

}
