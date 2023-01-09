package operacoes;

import interpreter.InterpretadorExpressao;
import interpreter.Numero;

public class Divisao implements InterpretadorExpressao{
	private double x;
    private double y;

    public Divisao (Numero elementoEsquerda, Numero elementoDireita) {
        x = elementoEsquerda.getNumero();
        y = elementoDireita.getNumero();
    }

    public double interpretar() {
        return x / y;
    }
}
