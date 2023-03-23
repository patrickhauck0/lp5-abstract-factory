package abstractfactory;

public class InssPessoaJuridica implements Inss {
    public String emitir() {
        return "A alíquota do INSS é de 11%";
    }
}
