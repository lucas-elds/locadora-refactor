package locadora.extrato;

import locadora.Aluguel;

import java.util.List;

public class ExtratoHTML extends Extrato {
    public String gerarTitulo(String nome) {
        return "<h1>Registro de Alugueis de <em>" + nome + "</em></h1>" + System.lineSeparator();
    };
    public String gerarListaAlugueis(List<Aluguel> alugueis) {
        String lista = "<ul>" + System.lineSeparator();
        for (Aluguel a: alugueis) {
            if(a.getItem().getClassificacao().isNull()){
                continue;
            }
            lista += "<li><p>" + a.getItem().getTitulo() + ": R$ " + a.valor() + "</p></li>"+ System.lineSeparator();
        }
        return lista + "</ul>" + System.lineSeparator();
    };
    public String gerarRodape(double valorTotal, int pontosTotais) {
        return "<p>Valor total pago: <b>R$ " + valorTotal + "</b></p>"+ System.lineSeparator() +
                "<p>Voce acumulou <b>" + pontosTotais + " pontos</b> de alugador frequente</p>";
    };
}
