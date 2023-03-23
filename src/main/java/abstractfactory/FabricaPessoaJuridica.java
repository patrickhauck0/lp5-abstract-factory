package abstractfactory;

public class FabricaPessoaJuridica implements FabricaAbstrata {
    @Override
    public Imposto createImposto() {return new ImpostoPessoaJuridica();}

    @Override
    public Inss createInss() {return new InssPessoaJuridica();}
}
