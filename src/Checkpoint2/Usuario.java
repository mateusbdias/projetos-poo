package Checkpoint2;

public abstract class Usuario {
    private String username;
    private String senha;
    private String nome;
    private String sobrenome;
    private Endereco endereco;

    public Usuario(String username, String senha, String nome, String sobrenome) {
        this.username = username;
        this.senha = senha;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco.toString();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void vincularEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void redefinirSenha(String novaSenha){
        this.senha = novaSenha;
    }
}
