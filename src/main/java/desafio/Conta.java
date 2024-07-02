package desafio;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;

    public Conta() {
    }

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getAgencia() {
        return agencia;
    }
    public Cliente getCliente() {
        return cliente;
    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
    }

    @Override
    public String toString() {
        return "Conta{"
                + "agencia=" + agencia
                + ", numero=" + numero
                + ", saldo=" + saldo
                + ", cliente=" + cliente
                + '}';
    }


    protected void imprimirDadosComuns(){
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println("Agencia: " + this.agencia);
    System.out.println("Número: " + this.numero);
    System.out.println("Saldo: " + this.saldo);
    }

}
