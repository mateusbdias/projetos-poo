package Aula12Mesa;

public class Tecnico extends Assistente{
    private double bonus;

    public Tecnico(String nome, double salario, int numMatricula, double bonus){
        super(nome, salario, numMatricula);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void ganhoAnual(){
        System.out.println("O salário anual é de " + ((getSalario() * 12) + bonus));
    }

    @Override
    public void exibeDados(){
        System.out.println("Nome: " + getNome() + "\nSalário: " + getSalario() +
                "\nNúmero de Matrícula: " + getNumMatricula() + "\nBônus: " +
                bonus);
    }
}
