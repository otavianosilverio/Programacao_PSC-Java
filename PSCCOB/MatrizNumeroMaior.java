package PSCCOB;

import java.util.Scanner;

public class MatrizNumeroMaior {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maior = 0;
		int soma = 0;
		// criação da Matrix
        int [][] Notas = new int[7][5];
        // Preencher a Matriz   
        // For para percorrer as linhas
        for(int linha =0;linha<7;linha++){
            for(int coluna=0;coluna < 5;coluna++){
              // inserindo Numeros Aleatorios
              Notas[linha][coluna] = (int)(Math.random()*10)+1;
            }
        }
        // Imprimir a Matriz e verificar qual numero é maior
        for(int linha =0;linha<7;linha++){
        	
            for(int coluna=0;coluna < 5;coluna++){
            	if (Notas[linha][coluna] > maior) {
            		maior = Notas[linha][coluna];
            	}
            	soma = soma +Notas[linha][coluna];
            	System.out.print(Notas[linha][coluna]+"   ");
            }
            System.out.println("  ");
        }
        System.out.println("--------------------- ");
        System.out.println("O maior numero da matriz é  "+maior);
        System.out.println("A soma da matriz é  "+soma);
       
	}

}
