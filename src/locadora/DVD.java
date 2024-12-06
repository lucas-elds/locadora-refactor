package locadora;


import locadora.classificacao.Classificacao;
import locadora.classificacao.ClassificacaoFactory;

public class DVD implements Alugavel {


    private Classificacao classificacao;
    private String titulo;

    public DVD(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        setCodigoDePreco(codigoDePreco);
    }

    public String getTitulo() {
        return titulo;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public double getValorDoAluguel(int diasAlugado) {
        return classificacao.getValorDoAluguel(diasAlugado);
    }

    public int getPAF(int diasAlugado) {
        return classificacao.getPAF(diasAlugado);
    }

    public int getCodigoDePreco() {
        return classificacao.getCodigoDePreco();
    }

    public void setCodigoDePreco(int codigoDePreco) {
        this.classificacao = ClassificacaoFactory.create(codigoDePreco);
    }
}