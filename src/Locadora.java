//********** import para executar o código conforme modificações da lista01.2.1-GRASP-refactoring
import locadora.Cliente;
import locadora.Aluguel;
import locadora.DVD;
import locadora.classificacao.Classificacao;
import locadora.extrato.Extrato;
import locadora.extrato.ExtratoConsole;
import locadora.extrato.ExtratoHTML;
//********** import para executar o código conforme modificações da lista01.2.2-GRASP-refactoring
//import refactoring1.Cliente;
//************************************************************************************************
//********** import para executar o código conforme modificações da lista01.2.3-GRASP-refactoring
//import refactoring2.Cliente;
//import refactoring2.Aluguel;
//************************************************************************************************


public class Locadora {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alex Sandro");

        c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", Classificacao.NORMAL), 10));
        c1.adicionaAluguel(new Aluguel(new DVD("Luca", Classificacao.INFANTIL), 2));
        c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", Classificacao.LANCAMENTO), 30));
        c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", Classificacao.LANCAMENTO), 4));
        c1.adicionaAluguel(new Aluguel(new DVD("Moana", Classificacao.INFANTIL), 10));
        c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", Classificacao.NORMAL), 3));
        c1.adicionaAluguel(new Aluguel(new DVD("Ainda Estou Aqui", 4), 3));

        Extrato extrato = new ExtratoHTML();
        System.out.println(c1.extrato(extrato));
    }
}
