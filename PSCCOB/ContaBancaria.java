public class ContaBancaria {
  // Atributos da minha classe
  public int numero, agencia;
  private double saldo;
  // Metodos da minha classe
   public boolean sacar(double valor){
    if (valor <= saldo){
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

   