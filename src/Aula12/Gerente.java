package Aula12;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, String sobrenome, String cpf, String email,
                   String matricula, double salario, double bonus) {
        super(nome, sobrenome, cpf, email, matricula, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void pagamento(){
        System.out.println("O salário é de " + (getSalario() + bonus));
    }
}
