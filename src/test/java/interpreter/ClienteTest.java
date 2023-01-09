package interpreter;

import static org.junit.Assert.*;

import org.junit.Test;


public class ClienteTest {

	@Test
	public void deveCalcularExpressaoComFormula() {
        Cliente cliente = new Cliente();
        cliente.setValorCompra(22.0);
        cliente.setPorcentagemValorDeAtendimento(10.0);

        assertEquals(24.2, cliente.calcularValorCompraComAcrescimentoAtendimento(), 0.1);
    }

}
