package locadora;


import locadora.classificacao.Classificacao;
import locadora.classificacao.ClassificacaoInfantil;
import locadora.classificacao.ClassificacaoLancamento;
import locadora.classificacao.ClassificacaoNormal;

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
        this.classificacao = ClassificationFactory.create(codigoDePreco);

    }

}
