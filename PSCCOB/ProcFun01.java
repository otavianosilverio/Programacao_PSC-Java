package PSCCOB;
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class ProcFun01 {

	public static void main(String[] args) {
	    // TODO code application logic here
        double salario,imposto;
        Scanner ler = new 
        Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");    
        
        System.out.println("Digite seu salario: ");
        salario = ler.nextDouble();
        imposto=CalculaImposto(salario);
        System.out.println("Você pagará em impostos: R$"+ deci.format(imposto));
    }
    public static double CalculaImposto(Double x){
        double desconto;
        desconto=x*0.14;
        return desconto;
    }

}
