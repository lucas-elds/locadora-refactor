package locadora.classificacao;

public abstract class Classificacao {
    public static final int NORMAL = 0;
    public static final int LANCAMENTO = 1;
    public static final int INFANTIL = 2;

    public abstract int getCodigoDePreco();
    public abstract double getValorDoAluguel(int diasAlugado);
    public int getPAF(int diasAlugado) {
        return 1;
    }
    public boolean isNull(){
        return false;
    };
}
