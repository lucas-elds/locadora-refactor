package locadora;

public class Aluguel {
    private Alugavel item;
    private int diasAlugado;

    public Aluguel(Alugavel item, int diasAlugado) {
        this.item = item;
        this.diasAlugado = diasAlugado;
    }

    public double valor() {
        return item.getValorDoAluguel(diasAlugado);
    }

    public Alugavel getItem() {
        return item;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }
}
