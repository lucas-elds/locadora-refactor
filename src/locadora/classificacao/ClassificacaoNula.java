package locadora.classificacao;

public class ClassificacaoNula extends Classificacao {

    public int getCodigoDePreco(){
        return -1;
    };
    public double getValorDoAluguel(int diasAlugado){
        return 0.0;
    };
    public int getPAF(int diasAlugado) {
        return 0;
    }
    @Override
    public boolean isNull(){
        return true;
    }
}