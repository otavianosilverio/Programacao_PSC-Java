package PSCCOB;

import java.util.Scanner;
/*
 * Faça um programa que leia um vetor com 10 
 * elementos inteiros. Solicite ao usuário que 
 * informe um novo número, e verifique se este 
 * número encontra-se no vetor. Caso positivo,
 * imprima a(s) posição(ões) em que este número 
 * estiver no vetor. Caso contrário, 
 * exiba uma mensagem avisando ao usuário 
 * informando que o número não se encontra no vetor.
 */
public class VetorAdvinha {

	public static void main(String[] args) {
		
		 int numeros[] = new int[10];
		 int pesquisa = 0;
		 Scanner input = new Scanner(System.in);
		 // preencher numeros aleatorios
		 for (int i = 0; i < numeros.length; i++)
	     {
	          numeros[i] = (int)(Math.random()*20)+1;
	     }
		 // Mostrar os numeros sorteados
		  for (int i = 0; i < numeros.length; i++)
		     {
		       	System.out.println("Posicao "+i+" Valor "+numeros[i]);
		       
		     }
		 System.out.println("informe o numero que deseja pesquisar");
         pesquisa = input.nextInt();
         for (int i = 0; i < numeros.length; i++)
	     {
	        if (pesquisa == numeros[i]) {
	        	System.out.println("O numero foi encontrado na posicao "+i);
	        }
	     }
         
         
		 
	}

}
