package Q8_CokeMachine;

public class Resultado {
	    // Atributos
	    public int qtLatas;
	    public double precouni;
	    public double cred;
		public String resultado(){
		     String msg;
		     double resul = qtLatas * precouni;
		     if (resul <= cred) {
		         msg = "Retire sua(s) lata(s)";
		         if (cred > resul){
		             msg = msg + " e retire seu troco (R$ " + (cred - resul) + ")";
		         }
		     } else {
		         msg = "O valor da célula insuficiente para comprar da quantidade de lata(s)";
		     }
		     return msg;
		}
		
}
