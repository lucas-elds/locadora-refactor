package locadora;

import locadora.extrato.Extrato;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Aluguel> listaAlugueis = new ArrayList<Aluguel>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        listaAlugueis.add(aluguel);
    }

    public double getValorTotal() {
        double valorTotal = 0.0;
        for (Aluguel a : listaAlugueis) {
            valorTotal += a.valor();
        }
        return valorTotal;
    }

    public int getTotalPAF() {
        int pontosTotais = 0;
        for (Aluguel a : listaAlugueis) {
            pontosTotais += a.getItem().getPAF(a.getDiasAlugado());
        }
        return pontosTotais;
    }

    public String extrato(Extrato extrato) {
        return extrato.emitirExtrato(nome, listaAlugueis, getValorTotal(), getTotalPAF());
    }

}

