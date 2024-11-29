package locadora;

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

    public String extrato() {
        int pontosTotais = 0;
        String resultado = "Registro de Alugueis de " + getNome() + System.lineSeparator();

        for (Aluguel a: listaAlugueis) {
            resultado += "\t" + a.getItem().getTitulo() + "\t R$ " + a.valor() + System.lineSeparator();
            pontosTotais += a.getItem().getPAF(a.getDiasAlugado());
        }
        // adiciona rodapé7
        resultado += "Valor total pago: R$ " + getValorTotal() + System.lineSeparator();
        resultado += "Voce acumulou " + pontosTotais + " pontos de alugador frequente";

        return resultado;
    }

    public String extratoHTML() {
        final String fimDeLinha = System.lineSeparator();
        Iterator<Aluguel> alugueis = listaAlugueis.iterator();
        String resultado = "<H1>Registro de Alugueis de <EM>" + getNome() + "</EM></H1><P>" + fimDeLinha;
        while(alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            // mostra valores para este aluguel
            resultado += cada.getItem().getTitulo() + ": R$ " + cada.valor() + "<BR>"+ fimDeLinha;
        } // while
        // adiciona rodapé
        resultado += "<P>Valor total pago: <EM>R$ " + getValorTotal() + "</EM>"+ fimDeLinha;
        //resultado += "<P>Voce acumulou <EM>" + pontosTotais + " pontos </EM> de alugador frequente";
        return resultado;
    }
}

