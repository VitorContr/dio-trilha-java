
public class Main {

	public static void main(String[] args) {
	 	Cliente venilton = new Cliente();
		venilton.setNome("Encapisulado");
		venilton.setSobrenome("Getset");
		venilton.setIdentidade(999999999);
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
