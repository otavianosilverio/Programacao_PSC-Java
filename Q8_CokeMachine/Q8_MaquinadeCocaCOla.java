package Q8_CokeMachine;
import java.util.Scanner;

public class Q8_MaquinadeCocaCOla {

	public static void main(String[] args) {
		int qtLatas=0;
		double VlCoca =0.0;
		Scanner ler = new 
		Scanner(System.in);
	    System.out.println("A quantidade de Latas:");
	    qtLatas = ler.nextInt();
	    
	    System.out.println("Insira a Cedula:");
	    VlCoca = ler.nextDouble();
	    //
	    Resultado MaqCoca = new Resultado();
	    MaqCoca.cred = VlCoca;
	    MaqCoca.qtLatas = qtLatas;
		// Preço Fixo da Lata
	    MaqCoca.precouni = 2.00;
	    
	    System.out.println("O resultado :"+MaqCoca.resultado());
	    
	}
   
	
	
	
}
