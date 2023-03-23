package abstractfactory;

public class ImpostoPessoaJuridica implements Imposto{
    public String emitir() {
        return "A alíquota do imposto de renda é de 15%";
    }
}
