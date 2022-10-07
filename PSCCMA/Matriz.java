package PSCCMA;

public class Matriz {

	public static void main(String[] args) {
		   // TODO code application logic here
        int [][]b= new int[3][3];
        System.out.println(b);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=j+i;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.println("O vetor tem o valor "+b[i][j]+" na posição "+(i+1)+" "+(j+1)+" com indice "+i+" "+j);
            }
        }

	}

}
