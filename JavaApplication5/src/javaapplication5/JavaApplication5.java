package javaapplication5;

import javaapplication5.Algoritmo;
import javaapplication5.Jokenpo;
import javaapplication5.Papel;
import javaapplication5.Tipo;
import javaapplication5.Pedra;
import javaapplication5.Tesoura;
import javaapplication5.Lagarto;
import javaapplication5.Spock;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        var jokenpo = new Jokenpo();

        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
        int jogada = in.nextInt();
        int computador = new Random().nextInt(5) + 1;
        System.out.println("O COMPUTADOR escolheu: " + Tipo.getInstance(computador));
        
        var algoritmo = getAlgoritmo(jogada);

        jokenpo.setAlgoritmo(algoritmo);
        Tipo tipoJogadaComputador = Tipo.getInstance(computador);

        jokenpo.jogar(tipoJogadaComputador);

        in.close();

    }
    private static Algoritmo getAlgoritmo(Integer pId) {
        Algoritmo algoritmo = null;
        switch (pId) {
            case 1 -> algoritmo = new Papel();
            case 2 -> algoritmo = new Tesoura();
            case 31 -> algoritmo = new Pedra();
            case 4 -> algoritmo = new Lagarto();
            case 5 -> algoritmo = new Spock();
            
            default -> throw new IllegalStateException("Unexpected value: " + pId);
        }
        return algoritmo;
    }
}