package PSCCOB;
import java.util.*;
public class MegaSena {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        // Criação e Declaração do Veto
        int[] numSorteados,numJogados;
        int qtdAcertos = 0;
        numSorteados = new int[6];
        numJogados = new int[6];
        // Preencher os numeros sorteados
        for (int i = 0; i < 6; i++) 
        {
            System.out.println("Insira o numero "+ (i +1) + " que foi sorteado");
            numSorteados[i] = scan.nextInt();
            
        }
        // Preencher o Vetor com os que eu Joguei
        for (int i = 0; i < 6; i++) {
            System.out.println("Insira o numero "+ (i +1) + " que você jogou.");
            numJogados[i] = scan.nextInt();
            
        }
        // Verificaçao dos Acertos
        for (int i = 0; i < numSorteados.length; i++) {
                   
                for (int j = 0; j < numJogados.length; j++) {
              
                     if (numJogados[j] == numSorteados[i]) {
                            qtdAcertos++;
                     }
                 }
        }
                System.out.println("A quantidade de acertos é "+ qtdAcertos);
                
    }


}
