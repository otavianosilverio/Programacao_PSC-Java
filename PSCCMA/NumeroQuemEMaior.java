package PSCCOB;
import java.util.*;
public class NumeroQuemEMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero,maior=0,menor=0;
		
		
		 Scanner ler = new 
		 Scanner(System.in);
		 System.out.println("Informe o Primeiro Numero");
		 numero = ler.nextInt();
		 maior = numero;
		 menor = numero;
		 System.out.println("MAIOR É  "+maior);
		 System.out.println("menor É  "+menor);
		 
		 for (int x = 2;x<=10;x++) {
			 System.out.println("Informe o Numero "+x);
			 numero = ler.nextInt();
			 if (numero > maior) {
				 maior = numero;
			 }
			 if (numero<menor) {
				 menor = numero;
			 }
			 System.out.println("MAIOR É  "+maior);
			 System.out.println("menor É  "+menor);
		 }
		 System.out.println("MAIOR É  "+maior);
		 System.out.println("menor É  "+menor);
	}

}
