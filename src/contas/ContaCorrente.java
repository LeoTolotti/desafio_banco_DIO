package contas;

public class ContaCorrente extends Contas{
    public void imprimieExtrato(){
        System.out.println("Conta Corrente");
        System.out.println("Ag: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Saldo: " + super.saldo);
    }
}
