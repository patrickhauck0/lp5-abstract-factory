package abstractfactory;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TributosTest {
    @Test
    public void deveEmitirImpostoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Tributos tributos = new Tributos(fabrica);
        assertEquals("A alíquota do imposto de renda é de 7,5%", tributos.emitirImposto());
    }

    @Test
    public void deveEmitirInssPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Tributos tributos = new Tributos(fabrica);
        assertEquals("A alíquota do INSS é de 20%", tributos.emitirInss());
    }

    @Test
    public void deveEmitirImpostoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Tributos tributos = new Tributos(fabrica);
        assertEquals("A alíquota do imposto de renda é de 15%", tributos.emitirImposto());
    }

    @Test
    public void deveEmitirInssPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Tributos tributos = new Tributos(fabrica);
        assertEquals("A alíquota do INSS é de 11%", tributos.emitirInss());
    }

}