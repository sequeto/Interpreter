package interpreter;

public class Cliente {
    private double valorCompra;
    private double porcentagemValorDeAtendimento;

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double nota1) {
        this.valorCompra = nota1;
    }

    public double getPorcentagemValorDeAtendimento() {
        return porcentagemValorDeAtendimento;
    }

    public void setPorcentagemValorDeAtendimento(double porcentagemValorDeAtendimento) {
        this.porcentagemValorDeAtendimento = porcentagemValorDeAtendimento;
    }

    public double calcularValorCompraComAcrescimentoAtendimento() {
        return Loja.calcularValorCompraComAcrescimentoAtendimento(this.porcentagemValorDeAtendimento, this.valorCompra);
    }
}
