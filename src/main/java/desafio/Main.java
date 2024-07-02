package desafio;

public class Main {
    public static void main(String[] args) {

        Banco bancoA = new Banco();
        bancoA.setNome("Virtual Bank");

        Conta cc = new ContaCorrente(new Cliente("JOANA SOUSA", bancoA));
        cc.depositar(100);

        Conta cp = new ContaPoupanca(new Cliente("JOAO DA CRUZ", bancoA));

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferir(25, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        bancoA.exibirListaClientes();

        Conta cc2 = new ContaCorrente(new Cliente("VALERIA MATOS", bancoA));
        cc2.imprimirExtrato();

        bancoA.exibirListaClientes();

    }
}
 /* Descrição do Desafio
Reforce seu conhecimento em Programação Orientada a Objetos (POO) em Java com um desafio
de projeto totalmente prático.
Para isso, os pilares da orientação a objetos são devidamente
explorados no contexto bancário, onde o expert implementa um projeto de referência
(disponibilizado no GitHub) de forma prática e interativa. Sendo assim, você poderá
desenvolver sua capacidade de abstração reproduzindo essa solução. Além disso, caso queira ir além,
implemente suas próprias evoluções e melhorias ;)

Objetivo: O objetivo deste projeto prático hands-on é reforçar o conhecimento
em Programação Orientada a Objetos (POO) em Java, através da implementação de um banco digital.

Descrição: Neste projeto, será disponibilizado no GitHub um projeto de referência que
utiliza os conceitos de POO e Java para criar um banco digital. O contexto bancário será
explorado para explorar os pilares da orientação a objetos, e assim, os participantes poderão
reproduzir a solução e desenvolver sua capacidade de abstração.
 */