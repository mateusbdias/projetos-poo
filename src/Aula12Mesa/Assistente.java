package Aula12Mesa;

public class Assistente extends Funcionario{
    private int numMatricula;

    public Assistente(String nome, double salario, int numMatricula){
        super(nome, salario);
        this.numMatricula = numMatricula;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public void exibeDados(){
        System.out.println("Nome: " + getNome() + "\nSalário: " +
                getSalario() + "\nNúmero de Matrícula: " + numMatricula);
    }
}
