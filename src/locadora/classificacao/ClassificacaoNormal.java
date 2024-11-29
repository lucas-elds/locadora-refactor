package locadora.classificacao;

public class ClassificacaoNormal extends Classificacao {
    @Override
    public int getCodigoDePreco() {
        return Classificacao.NORMAL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valor = 2.0;
        if(diasAlugado > 2) {
            valor += (diasAlugado - 2) * 1.5;
        }
        return valor;
    }
}
