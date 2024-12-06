package locadora.extrato;

import locadora.Aluguel;

import java.util.List;

public class ExtratoConsole extends Extrato {
    public String gerarTitulo(String nome) {
        return "Registro de Alugueis de " + nome + System.lineSeparator();
    };
    public String gerarListaAlugueis(List<Aluguel> alugueis) {
        String lista = "";
        for (Aluguel a: alugueis) {
            if(a.getItem().getClassificacao().isNull()){
                continue;
            }
            lista += "\t" + a.getItem().getTitulo() + "\t R$ " + a.valor() + System.lineSeparator();
        }
        return lista;
    };
    public String gerarRodape(double valorTotal, int pontosTotais) {
        return "Valor total pago: R$ " + valorTotal + System.lineSeparator() +
                "Voce acumulou " + pontosTotais + " pontos de alugador frequente";
    };
}
