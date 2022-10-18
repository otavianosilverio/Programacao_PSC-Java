package PSCCMA;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// criação da Matrix
        int [][] Notas = new int[7][5];
        // Preencher a Matriz   
        // For para percorrer as linhas
        for(int linha =0;linha<7;linha++){
            for(int coluna=0;coluna < 5;coluna++){
            	 System.out.println("A Nota do Aluno: "+linha+" da coluna "+coluna);
                 Notas[linha][coluna] = scan.nextInt();
            }
        }
        // Imprimir a Matriz
        for(int linha =0;linha<7;linha++){
            for(int coluna=0;coluna < 5;coluna++){
            	 System.out.print(Notas[linha][coluna]+" ");
            }
            System.out.println("");
        }
       
	}

}
