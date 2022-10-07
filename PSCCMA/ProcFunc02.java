package PSCCOB;
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
public class ProcFunc02 {

	public static void main(String[] args) {
		  // TODO code application logic here
        double faturamento,inss,simples,crea,icms,iss;
        Scanner ler = new 
        Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");    
        
        for(int i=0;i<12;i++){
            System.out.println("Digite seu faturamento no mês "+(i+1));
            faturamento = ler.nextDouble();

            inss=CalculaImposto(faturamento,0.03);
            System.out.println("Você pagará de INSS no mês "+(i+1)+": R$"+ deci.format(inss));
            simples=CalculaImposto(faturamento,0.025);
            System.out.println("Você pagará de Simples no mês "+(i+1)+": R$"+ deci.format(simples));
            crea=CalculaImposto(faturamento,0.0145);
            System.out.println("Você pagará de CREA no mês "+(i+1)+": R$"+ deci.format(crea));
            icms=CalculaImposto(faturamento,0.02);
            System.out.println("Você pagará de ICMS no mês "+(i+1)+": R$"+ deci.format(icms));
            iss=CalculaImposto(faturamento,0.0167);
            System.out.println("Você pagará de ISS no mês "+(i+1)+": R$"+ deci.format(iss));
        }
    }
    public static double CalculaImposto(Double x, Double y){
        double desconto;
        desconto=x*y;
        return desconto;
   	}

}
