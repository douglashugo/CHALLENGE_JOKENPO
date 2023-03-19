package javaapplication5;

import java.util.Map;

public class Spock extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Perdeu! Papel refuta spock!";
            case TESOURA -> valor = "Ganhou! Spock esmaga tesoura!";
            case PEDRA -> valor = "Ganhou! Spock vaporiza pedra!";
            case LAGARTO -> valor = "Perdeu! Lagarto envenena spock!";
            case SPOCK -> valor = "Empatou! Spock com spock!";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}
