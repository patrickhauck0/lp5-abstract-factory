package abstractfactory;

public class ImpostoPessoaFisica implements Imposto {
    public String emitir() {
        return "A alíquota do imposto de renda é de 7,5%";
    }
}
