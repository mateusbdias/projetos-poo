package AulaRevisao;

public class Curso extends OfertaAcad{
    private int cargaHoraria;
    private int duracao;
    private double valorHora;

    public Curso(){}
    public Curso(String nome, String descricao, int cargaHoraria, int duracao, double valorHora) {
        super(nome, descricao);
        this.cargaHoraria = cargaHoraria;
        this.duracao = duracao;
        this.valorHora = valorHora;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularPreco(){
        return this.cargaHoraria * this.valorHora * this.duracao;
    }
}
