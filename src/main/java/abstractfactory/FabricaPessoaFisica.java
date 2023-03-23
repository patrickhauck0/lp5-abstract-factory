package abstractfactory;

public class FabricaPessoaFisica implements FabricaAbstrata {
    @Override
    public Imposto createImposto() {return new ImpostoPessoaFisica();}

    @Override
    public Inss createInss() {return new InssPessoaFisica();}
}
