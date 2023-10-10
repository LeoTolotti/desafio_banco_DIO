package clientes;

import utilidade.LeitorDeDados;

public class Clientes {
    private static String nome;
    private static String cpf;
    public String cadastrarClienteNome(){
        System.out.println("Nome: ");
        nome = LeitorDeDados.lerDado();
        return nome;
    }
    public String cadastrarClienteCpf(){
        System.out.println("Cpf: ");
        cpf = LeitorDeDados.lerDado();
        return cpf;
    }
    
}