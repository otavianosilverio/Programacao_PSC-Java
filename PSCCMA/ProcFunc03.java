package PSCCOB;
import java.util.Scanner;
import java.io.*;
public class ProcFunc03 {
	 public static void ConectaBanco(){
	        System.out.println("Conectando ao Bando de dados");
	        System.out.println("Obtendo Dados do Servidor");
	        System.out.println("Conectado");
	    }
	    public static void DesconectaBanco(){
	        System.out.println("Desconectando ao Bando de dados");
	        System.out.println("Enviando Dados do Servidor");
	        System.out.println("Desconectado");
	    }
	    public static void main(String[] args) {
	        // TODO code application logic here
	        System.out.println("Digite Seu Comando:");
	        System.out.println("Salvando seu comando na base de dados");
	        ConectaBanco();
	        DesconectaBanco();
	    }   

}
