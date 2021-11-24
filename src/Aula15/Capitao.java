package Aula15;

public class Capitao {
    private String nome;
    private String apelido;
    private int regNav;

    public Capitao(String nome, String apelido, int regNav) {
        this.nome = nome;
        this.apelido = apelido;
        this.regNav = regNav;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getRegNav() {
        return regNav;
    }

    public void setRegNav(int regNav) {
        this.regNav = regNav;
    }
}
