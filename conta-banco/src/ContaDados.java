
public class ContaDados {

	private int nConta;
	private String sAgencia;
	private String sNomeCliente;
	private double dSaldo;
	
	public int getnConta() {
		return nConta;
	}
	public void setnConta(int nConta) {
		this.nConta = nConta;
	}
	public String getsAgencia() {
		return sAgencia;
	}
	public void setsAgencia(String sAgencia) {
		this.sAgencia = sAgencia;
	}
	public String getsNomeCliente() {
		return sNomeCliente;
	}
	public void setsNomeCliente(String sNomeCliente) {
		this.sNomeCliente = sNomeCliente;
	}
	public double getdSaldo() {
		return dSaldo;
	}
	public void setdSaldo(double dSaldo) {
		this.dSaldo = dSaldo;
	}
	
	public void exibirInfos() {
		System.out.println("Conta: " + nConta);
		System.out.println("Agencia: "+ sAgencia);
		System.out.println("Titular: "+sNomeCliente);
		System.out.println("Saldo: "+dSaldo);
	}	
	

/*	public ContaDados(int nConta,String sAgencia,String sNomeCliente,double dSaldo){
		this.nConta = nConta;
		this.sAgencia = sAgencia;
		this.sNomeCliente = sNomeCliente;
		this.dSaldo = dSaldo;
	} */
	
	
}
