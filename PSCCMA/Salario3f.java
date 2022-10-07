package PSCCOB;
import java.util.*;
public class Salario3f {

	public static void main(String[] args) {
		 double boleto1, boleto2, boleto3,boleto4, totalboleto,salariobruto, salarioliquido,diferenca;    
		    Scanner ler = new 
		    Scanner(System.in);
		  
		    System.out.println("Digite o seu salario bruto:");
		    salariobruto = ler.nextDouble();
		    System.out.println("Digite o 1º boleto:");
		    boleto1 = ler.nextDouble();
		    System.out.println("Digite o 2º boleto:");
		    boleto2 = ler.nextDouble();
		    System.out.println("Digite o 3º boleto:");
		    boleto3 = ler.nextDouble();
		    System.out.println("Digite o 4º boleto:");
		    boleto4 = ler.nextDouble();
		    salarioliquido = salariobruto*0.815;
		    System.out.println("O salário Liquido é: " + salarioliquido);
		    totalboleto = boleto1+boleto2+boleto3+boleto4;
		    System.out.println("O TOTAL DA FACADA É: " + totalboleto);
		    diferenca = salarioliquido-totalboleto;
		    System.out.println("A diferença é: " + diferenca);
		        if(diferenca>0){
		        System.out.println("Encaminhar para a poupança: " + diferenca);
		        }else{ 
		            if(diferenca==0){System.out.println("Tá de boas..., saldo: "+diferenca);
		            }else{
		                System.out.println("Deu ruim, Saldo: " + diferenca);
		            }
		        
		        }
		    }
}
