package PSCCMA;

public class Vetor {

	public static void main(String[] args) {
		 // TODO code application logic here
        int []a= new int[5];
        a[0]=12; a[1]=13;a[2]=32; a[3]=34;a[4]=53;
        System.out.println(a);
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
         
        }
        for(int i=0;i<5;i++){
         
            System.out.println("O vetor tem o valor "+a[i]+" na posição "+(i+1)+" com indice "+i);
        }
	}

}
