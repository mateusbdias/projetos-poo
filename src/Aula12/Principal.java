package Aula12;

public class Principal {
    public static void main(String[] args){
        Funcionario func = new Gerente("João", "Vitor", "123.456.789-00",
                "joao@dh.com", "DH123", 2000.21, 100);
        Empresa dh = new Empresa("DH", "12.345.678/0001-00");
        dh.addFuncionario(func);
    }
}
