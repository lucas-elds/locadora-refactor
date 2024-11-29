package locadora.classificacao;

import locadora.DVD;

public class ClassificacaoLancamento extends Classificacao {
    @Override
    public int getCodigoDePreco() {
        return 1;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        return diasAlugado * 3.00;
    }

    @Override
    public int getPAF(int diasAlugado) {
        return (diasAlugado > 1) ? 2 : 1;
    }
}
