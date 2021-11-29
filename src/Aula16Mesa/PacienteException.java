package Aula16Mesa;

public class PacienteException extends Exception{
    public PacienteException(){ }

    public PacienteException(String mensagem){
        super(mensagem);
    }

    @Override
    public String toString(){
        return getMessage();
    }
}
