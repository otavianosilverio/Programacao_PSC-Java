package PSCCOB;
import java.util.*;
public class Vetor {

	public static void main(String[] args) {
		
        int idade[] = new int[5];
        double salario[] = new double[5];
        double soma=0;

        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < idade.length; i++)
        {
            System.out.format("Digite o elemento %d do vetor: ", i);
            idade[i] = input.nextInt();
            System.out.println("Informe o salario ");
            salario[i] = input.nextDouble();
            soma = soma+salario[i];
        }
        System.out.println("A soma do vetor e"+ soma);
        System.out.println("Imprimindo o vetor");
        for (int i = 0; i < idade.length; i++) {
	     System.out.format("%d \t", idade[i]);
         System.out.println("Salario "+salario[i]);
      }

}
}
