public class Main {
    public static void main(String[] args) {

        Cliente Adriana = new Cliente();
        Adriana.setNome("Adriana");

        Conta cc = new ContaCorrente(Adriana);
        Conta poupanca = new ContaPoupanca(Adriana);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
