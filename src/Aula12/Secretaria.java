package Aula12;

public class Secretaria extends Funcionario{

    public Secretaria(String nome, String sobrenome, String cpf, String email,
                      String matricula, double salario) {
        super(nome, sobrenome, cpf, email, matricula, salario);
    }

    @Override
    public void pagamento(){
        System.out.println("O salário é de " + getSalario());
    }
}
