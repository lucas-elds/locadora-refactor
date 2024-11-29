package locadora;

import locadora.classificacao.Classificacao;
import locadora.classificacao.ClassificacaoInfantil;
import locadora.classificacao.ClassificacaoLancamento;
import locadora.classificacao.ClassificacaoNormal;

public class ClassificationFactory {
    public static Classificacao create(int codigoDeClassificacao) {
        return switch (codigoDeClassificacao) {
            case Classificacao.NORMAL -> new ClassificacaoNormal();
            case Classificacao.LANCAMENTO -> new ClassificacaoLancamento();
            case Classificacao.INFANTIL -> new ClassificacaoInfantil();
            default -> null;
        };
    }
}
