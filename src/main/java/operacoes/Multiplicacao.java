package operacoes;

import interpreter.InterpretadorExpressao;
import interpreter.Numero;

public class Multiplicacao implements InterpretadorExpressao {

    private double x;
    private double y;

    public Multiplicacao (Numero elementoEsquerda, Numero elementoDireita) {
        x = elementoEsquerda.getNumero();
        y = elementoDireita.getNumero();
    }

    public double interpretar() {
        return x * y;
    }
}
