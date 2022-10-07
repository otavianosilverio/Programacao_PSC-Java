package PSCCOB;
import java.util.*;
public class TemperaturaemBH {

	public static void main(String[] args) {
		// Calcular a media da temperatura nos primeiros 10 dias de setembro
		double temperatura=0.00,totaltemperatura=0,media = 0.00;    
	    Scanner ler = new 
	    Scanner(System.in);
		
	    for (int contador=10;contador>0;contador=contador-1) {
	    	// ler a temperatura
	    	    System.out.println("Informe a temperatura do dia :"+contador);
			    temperatura = ler.nextDouble();
			    totaltemperatura = totaltemperatura + temperatura ;
	    }
	    media = totaltemperatura / 10;
	    System.out.println("A Temperatura média é  :"+media);
	    

	}

}
