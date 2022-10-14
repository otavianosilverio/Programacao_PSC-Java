package PSCCMA;

import java.util.Scanner;

public class Lista63_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamanho=0;
		 Scanner ler = new 
		 Scanner(System.in);
		 
		 System.out.println("Informe o Tamanho da Matriz a ser criada ");
	     tamanho = ler.nextInt();
	     int [][]MatrizNova= new int[tamanho][tamanho];
	     int Maior = 0;
	     for(int i=0;i<tamanho;i++){
			  System.out.println("Linha =>: "+i);
	            for(int j=0;j<tamanho;j++){
	                MatrizNova[i][j]= (int)(Math.random()*100)+1;
	                // maior valor da matriz
	                if (MatrizNova[i][j]>Maior) {
	                	Maior = MatrizNova[i][j];
	                }
	                System.out.println("Coluna =>: "+MatrizNova[i][j]);
	            }
	        }
	        System.out.println("Maior Numero da Matriz =>: "+Maior);
	       // Trocando Numeros da Matriz
	        for(int i=0;i<tamanho;i++){
				  System.out.println("Linha =>: "+i);
		            for(int j=0;j<tamanho;j++){
	                  // maior valor da matriz
		                if ((MatrizNova[i][j] % 2)==0) {
		                	MatrizNova[i][j] = 1;
		                }else {
		                	MatrizNova[i][j] = -1;
		                }
		                System.out.println("Coluna =>: "+MatrizNova[i][j]);
		            }
		        }
		 
		 
		 
		 
		
		  int [][]Matriz= new int[3][10];
		  for(int i=0;i<3;i++){
			  System.out.println("Linha =>: "+i);
	            for(int j=0;j<10;j++){
	                Matriz[i][j]=j;
	                System.out.println("Coluna =>: "+j);
	            }
	        }
		
		  
		  
		  
	}

}
