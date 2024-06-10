public class Main {

	public static void main(String[] args) throws SaldoInsuficienteException {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		try {
			cc.depositar(100);
			cc.transferir(200, poupanca);

			cc.imprimirExtrato();
			poupanca.imprimirExtrato();

			poupanca.exibirHistorico();

		} catch (SaldoInsuficienteException e) {
			System.out.println("Messgame: " + e.getMessage());
		}
	}

}
