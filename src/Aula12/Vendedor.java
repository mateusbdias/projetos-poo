package Aula12;

public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, String sobrenome, String cpf, String email,
                    String matricula, double salario) {
        super(nome, sobrenome, cpf, email, matricula, salario);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void pagamento(){
        System.out.println("O salário é de " + (getSalario() + comissao));
    }
}