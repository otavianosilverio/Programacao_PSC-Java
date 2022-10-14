package PSCCMA;

import java.util.Scanner;

public class Lista5_1 {
/*
 * Um número inteiro e positivo, que retorne a soma dos 
 * elementos inteiros existentes entre 1 e o número (inclusive)
 */
	public static int Func5somanumeros(int Numero){
		int soma=0;
		for (int i=1;i<=Numero;i++) {
			soma = soma + i;
		}
		return soma;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = 0, numero =0;
		Scanner ler = new 
		Scanner(System.in);
		System.out.println("Informe o Numero: ");
        numero = ler.nextInt();
		
		System.out.println("Verificando a soma de :"+Func5somanumeros(numero));
		resultado = Func5somanumeros(numero);
		System.out.println("Verificando a soma de :"+resultado);
		
	}

}
