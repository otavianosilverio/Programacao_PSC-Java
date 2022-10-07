
package PSCCOB;

import java.util.*;

public class FuncaoCalculadora {
	// Programa Principal
	
	
	public static void main(String[] args) {
		 // Declaração e inicialização
		 double Numero1=0,Numero2=0,resultado=0;
		 int operacao=0;
		 
		 Scanner ler = new 
		 Scanner(System.in);
		 System.out.println("Informe o Primeiro Numero");
		 Numero1 = ler.nextDouble();
		 System.out.println("Informe o Segundo Numero");
		 Numero2 = ler.nextDouble();
		 System.out.println("Informe 1 - Soma ");
		 System.out.println("Informe 2 - Multiplicacao ");
		 System.out.println("Informe 3 - Divisao ");
		 System.out.println("Informe 4 - Subtracao ");
		 operacao = ler.nextInt();
	     
		 System.out.println("Resultado => "+calculadora(Numero1,Numero2,operacao));
		 
		 double NovoValor = calculadora(Numero1,Numero2,operacao)*2;
		 
		 System.out.println("Resultado => "+NovoValor);
	}
    
	// Funcão Calculadora
	public static  double  calculadora(double Numero1,double Numero2, int operacao) {
		double resultado=0.0;
		switch (operacao){
        case 1:
         	resultado = Numero1+Numero2;
         	// chamada do procedimento de Imprimir
         	imprimir("Somando...");
            break;
        case 2:
	     	resultado = Numero1*Numero2;
	     	imprimir("Multiplicando...");
	     	 break;
        case 3:
        	resultado = Numero1/Numero2;
        	imprimir("Dividindo...");
        	 break;
        case 4:
        	resultado= Numero1-Numero2;
        	imprimir("Subtrair...");
        	 break;
	  }
	 return resultado;
	
    }
	// Procedimentos IMprimir informações de inicio da calculadora
	public static void imprimir(String operacao) {
		 System.out.println("-------------------------------------");
		 System.out.println("A calculadora está ...."+operacao);
		 System.out.println("-------------------------------------");
	}
}
