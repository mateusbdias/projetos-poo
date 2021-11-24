package Aula15;

public class Embarcacao {
    private Capitao capitao;
    private double precoBase;
    private double valorAdicional;
    private int anoFab;
    private double comprimento;

    public Embarcacao(double precoBase, double valorAdicional, int anoFab, double comprimento) {
        this.precoBase = precoBase;
        this.valorAdicional = valorAdicional;
        this.anoFab = anoFab;
        this.comprimento = comprimento;
    }

    public Capitao getCapitao() {
        return capitao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void designarCapitao(Capitao capitao){
        this.capitao = capitao;
    }

    public double calcularAluguel(){
        if (this.anoFab > 2020) {
            return this.precoBase + this.valorAdicional;
        } else {
            return this.precoBase;
        }
    }
}
