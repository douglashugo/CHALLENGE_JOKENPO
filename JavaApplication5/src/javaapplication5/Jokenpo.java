package javaapplication5;

import java.util.Map;

public class Jokenpo {

    private Algoritmo algoritmo;

    public void setAlgoritmo(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
    }

    public void jogar(Tipo pTipo) {
        Map<String, String> map = algoritmo.executar(pTipo);
        System.out.println(map);
    }
}