package projeto;

public class Main {

    public static void main(String[] args) {

        Cliente harrison = new Cliente();
        harrison.setNome("Harrison");

        Conta cc = new ContaCorrente(harrison);
        cc.sacar(10.0);
        //cc.depositar(100);

        Conta poupanca = new ContaPoupanca(harrison);
        //cc.transferir(100, poupanca);
        //cc.transferir(10, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        
        
    }

}
