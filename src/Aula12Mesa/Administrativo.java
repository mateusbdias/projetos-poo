package Aula12Mesa;

public class Administrativo extends Assistente{
    private boolean noturno;
    private double adicNoturno;

    public Administrativo(String nome, double salario, int numMatricula,
                          boolean noturno, double adicNoturno){
        super(nome, salario, numMatricula);
        this.noturno = noturno;
        this.adicNoturno = adicNoturno;
    }

    public boolean isNoturno() {
        return noturno;
    }

    public void setNoturno(boolean noturno) {
        this.noturno = noturno;
    }

    public double getAdicNoturno() {
        return adicNoturno;
    }

    public void setAdicNoturno(double adicNoturno) {
        this.adicNoturno = adicNoturno;
    }

    @Override
    public void ganhoAnual(){
        if (noturno) {
            System.out.println("O salário anual é de " + ((getSalario() + adicNoturno) * 12));
        } else {
            System.out.println("O salário anual é de " + (getSalario() * 12));
        }
    }

    @Override
    public void exibeDados(){
        if (noturno) {
            System.out.println("Nome: " + getNome() + "\nSalário: " + getSalario()
                    + "\nNúmero de Matrícula: " + getNumMatricula() + "\nNoturno: "
                    + noturno + "\nAdicional Noturno: " + adicNoturno);
        } else {
            System.out.println("Nome: " + getNome() + "\nSalário: " +
                    getSalario() + "\nNúmero de Matrícula: " + getNumMatricula() +
                    "\nNoturno: " + noturno);
        }
    }
}
