package interpreter;

public class Loja {
	public static String formula = "porcentagemValorAtendimento / 100 * valorCompra + valorCompra";

    public static double calcularValorCompraComAcrescimentoAtendimento(double porcentagemValorAtendimento, double valorCompra) {
        String expressao;
        expressao = formula.replace("porcentagemValorAtendimento", Double.toString(porcentagemValorAtendimento));
        expressao = expressao.replace("valorCompra", Double.toString(valorCompra));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
