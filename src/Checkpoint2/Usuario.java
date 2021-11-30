package Checkpoint2;

public abstract class Usuario {
    private String username;
    private String senha;
    private String nome;
    private String sobrenome;
    private Endereco endereco;

    // Construtor sem o endereço (há método específico para vinculação ao usuário)
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

    // O Getter referente ao endereço aproveita o Override do método toString na classe Endereco, mostrando os dados do atributo de uma forma mais organizada
    public String getEndereco() {
        return endereco.toString();
    }

    // Método utilizado para vincular o endereço ao usuário (substitui o respectivo Setter)
    public void vincularEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    // Método utilizado para alterar a senha do usuário (substitui o respectivo Setter)
    public void redefinirSenha(String novaSenha){
        this.senha = novaSenha;
    }
}
