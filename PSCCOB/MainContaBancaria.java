// Código do Replit: https://replit.com/@OtavianoSilvrio/POOContaBancaria#Main.java
class Main {
  public static void main(String[] args) {
    double saldototal;
    System.out.println("Criar um classe do cliente Renan");
    
    ContaBancaria PF0901 = new ContaBancaria();
    
    PF0901.numero = 10909;
    PF0901.agencia = 1025;
    PF0901.depositar(1000);
    System.out.println("Criar um classe do cliente Gustavo");
    ContaBancaria Gustavo = new ContaBancaria();
    Gustavo.numero = 109100;
    Gustavo.agencia = 1025;
    PF0901.sacar(10000);
    
    System.out.println("O saldo da conta do gustavo : "+Gustavo.ConsultarSaldo());
    Gustavo.depositar(500);
    // Verificando saldo no programa principal
    //if (Gustavo.ConsultarSaldo() < 50){
    //  System.out.println("Saldo não disponivel para saque : ");
   // }else{
    //  Gustavo.sacar(1000);
   // }
    
    if (Gustavo.sacar(10) == true){
      System.out.println("Parabéns vc é um cara muito rico");
    }else{
      System.out.println("Perdeu. Seu dinheiro acabou. Quer emprestimo?");
    }
    System.out.println("O saldo da conta do gustavo : "+Gustavo.ConsultarSaldo());
    System.out.println("O saldo da conta do Renan : "+PF0901.ConsultarSaldo());
    System.out.println("O saldo da conta do gustavo : "+Gustavo.ConsultarSaldo());
    
    saldototal = Gustavo.ConsultarSaldo()+PF0901.ConsultarSaldo();
     System.out.println("O saldo Total : "+saldototal);
  }
}
