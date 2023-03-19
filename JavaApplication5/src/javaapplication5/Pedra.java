package javaapplication5;

import java.util.Map;

public class Pedra extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Perdeu! Papel embrulha pedra!";
            case TESOURA -> valor = "Ganhou! Pedra esmaga tesoura!";
            case PEDRA -> valor = "Empatou! Pedra empata com pedra!";
            case LAGARTO -> valor = "Ganhou! Pedra esmaga lagarto!";
            case SPOCK -> valor = "Perdeu! Spock vaporza pedra!";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}

