package locadora.classificacao;

public class ClassificacaoFactory {
    public static Classificacao create(int codigoDeClassificacao) {
        return switch (codigoDeClassificacao) {
            case Classificacao.NORMAL -> new ClassificacaoNormal();
            case Classificacao.LANCAMENTO -> new ClassificacaoLancamento();
            case Classificacao.INFANTIL -> new ClassificacaoInfantil();
            default -> new ClassificacaoNula();
        };
    }
}
