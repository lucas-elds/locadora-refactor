package locadora;

import locadora.classificacao.Classificacao;

public interface Alugavel {
    public String getTitulo();
    public Classificacao getClassificacao();
    public double getValorDoAluguel(int diasAlugado);
    public int getPAF(int diasAlugado);
}
