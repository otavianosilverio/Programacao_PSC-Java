class Main {
  public static void main(String[] args) {
    // Instanciando Objetos Vivi
    ContaBancaria Vivi = new ContaBancaria();
    Vivi.numero = 1090;
    Vivi.banco = 567;
    Vivi.agencia = 100;
    Vivi.cpf = 190909090;
    Vivi.depositar(1000);
    if (Vivi.sacar(222500.0) == true){
      System.out.println("Saque realizado com sucesso");
    }else{
      System.out.println("Procure Gerente. Operação não autorizada");
    }

    System.out.println("O Saldo da Vivi "+Vivi.ConsultarSaldo());

 // Instanciando Objetos Vivi
    ContaBancaria Isaque = new ContaBancaria();
    Isaque.numero = 1080;
    Isaque.banco = 567;
    Isaque.agencia = 100;
    Isaque.cpf = 1909989090;
    Isaque.depositar(100);
    if (Isaque.sacar(50.0) == true){
      System.out.println("Saque realizado com sucesso");
    }else{
      System.out.println("Aqui não. Meu Banco não empresta dinheiro");
    }

    System.out.println("O Saldo do Isaque "+Isaque.ConsultarSaldo());
 System.out.println("O Saldo Baco "+(Isaque.ConsultarSaldo()+Vivi.ConsultarSaldo()));

    
  }
}