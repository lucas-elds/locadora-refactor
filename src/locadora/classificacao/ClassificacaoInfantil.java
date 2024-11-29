package locadora.classificacao;

public class ClassificacaoInfantil extends Classificacao {
    @Override
    public int getCodigoDePreco() {
        return Classificacao.INFANTIL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valor = 1.5;
        if(diasAlugado > 3) {
            valor += (diasAlugado - 3) * 1.5;
        }
        return valor;
    }
}
