import clientes.Clientes;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import contas.Contas;

public class Banco {
    private String nome;
    public static void main(String[] args) throws Exception {
        Clientes novo = new Clientes();
        Contas cc = new ContaCorrente();
        cc.conta(novo.cadastrarClienteNome(), novo.cadastrarClienteCpf());
        cc.depositar(500);
        cc.imprimieExtrato();
        
    }
}
