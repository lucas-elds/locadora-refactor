package locadora.extrato;

import locadora.Aluguel;

import java.util.List;

public abstract class Extrato {
    abstract String gerarTitulo(String nome);
    abstract String gerarListaAlugueis(List<Aluguel> alugueis);
    abstract String gerarRodape(double valorTotal, int pontosTotais);

    public String emitirExtrato(String nome, List<Aluguel> alugueis, double valorTotal, int pontosTotais) {
        return gerarTitulo(nome) + gerarListaAlugueis(alugueis) + gerarRodape(valorTotal, pontosTotais);
    };

}
