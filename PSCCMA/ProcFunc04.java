package PSCCOB;
import java.util.Scanner;
import java.io.*;
public class ProcFunc04 {
	   public static void ConectaBanco(){
	        System.out.println("Conectando ao Bando de dados");
	        System.out.println("Caminhão Cadastrado");
	    }
	        public static double CalculaTransbordo(Double x){
	        double seguranca;
	        seguranca=x*0.95;
	        return seguranca;
	    }
	    public static void main(String[] args) {
	        // TODO code application logic here
	        double carga, cargasegura,transporte;
	        String servico;
	        Scanner ler = new 
	        Scanner(System.in);
	         
	        System.out.println("Qual a Carga máxima de seu caminhão? ");
	        carga = ler.nextDouble();
	        
	        System.out.println("Gostaria de Cadastrar seu Caminhão para serviços? ");
	        servico = ler.next();
	        
	        if(servico.equals("s")){
	            ConectaBanco();
	            cargasegura=CalculaTransbordo(carga);
	            transporte=cargasegura*120.54;
	            System.out.println("Frete a ser pago: "+transporte);
	        }else{
	         System.out.println("Obrigado! Finalizando... ");
	        }
	    }

}
