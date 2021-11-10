package Aula10;

public class AssociadoHabilitado extends Associado {
    private double custoPiscina;
    private boolean habilitado;

    public AssociadoHabilitado(String numero, String nome, double valorMensal, String atividade, double custoPiscina){
        super(numero, nome, valorMensal, atividade);
        this.custoPiscina = custoPiscina;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public double custoMensal() {
        if (this.habilitado) {
            return super.custoMensal() + this.custoPiscina;
        } else {
            return super.custoMensal();
        }
    }
}
