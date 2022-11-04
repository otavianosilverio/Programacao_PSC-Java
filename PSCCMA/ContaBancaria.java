public class ContaBancaria{
  // atributos
  public int numero,banco,agencia,cpf;
  private double saldo;

  // metodos
  public boolean sacar(double valor){
    if (saldo >= valor){
      saldo = saldo - valor;
      return true;
    }else{
      return false;
    }
  }
  public void depositar(double valor){
    saldo = saldo + valor;
  }
  public double ConsultarSaldo(){
    return saldo;
  }
  
}