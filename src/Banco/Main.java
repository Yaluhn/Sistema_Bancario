package Banco;

public class Main {
	public static void main(String[] args) {
		Cliente ravel = new Cliente();
		ravel.setNome("Ravel");
		
		Conta cc = new ContaCorrente(ravel);
		Conta cp = new ContaPoupanca(ravel);
		
		cc.depositar(240);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}