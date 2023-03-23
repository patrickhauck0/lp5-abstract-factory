package abstractfactory;

public class Tributos {
    private Imposto imposto;
    private Inss inss;

    public Tributos (FabricaAbstrata fabrica) {
        this.imposto = fabrica.createImposto();
        this.inss = fabrica.createInss();
    }

    public String emitirImposto() {return this.imposto.emitir();}
    public String emitirInss() {return this.inss.emitir();}
}
