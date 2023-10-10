package contas;

public abstract class Contas {
    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;
    protected int agencia;
    protected int conta;
    protected String nome;
    protected String CPF;
    protected double saldo;
    public void conta(String nome, String CPF){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.nome = nome;
        this.CPF = CPF;
    }
    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(double valor, Contas contaDestinho){
        this.sacar(valor);
        contaDestinho.depositar(valor);
    }
    public void imprimieExtrato() {
    }
    public void conta() {
    }
}
