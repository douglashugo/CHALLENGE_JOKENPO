package javaapplication5;

import java.util.Map;

public class Tesoura extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Ganhou! Tesoura corta papel!";
            case TESOURA -> valor = "Empatou! Tesoura com tesoura!";
            case PEDRA -> valor = "Perdeu! Pedra esmaga tesoura!";
            case LAGARTO -> valor = "Ganhou! Tesoura decapita lagarto!";
            case SPOCK -> valor = "Perdeu! Spock esmaga tesoura!";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}
