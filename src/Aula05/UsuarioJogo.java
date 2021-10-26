// Mesa 03: Vanessa Matos, Jehan Lucas, Mateus Benites, Rafael Nobre, Renan de Andrade, Gabriel Gomes, Tulio Marinho, Marcelo Ramos, Karina Osuka

package Aula05;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public UsuarioJogo(String nome, String nick){
        this.nome = nome;
        this.nickname = nick;
        this.pontuacao = 0;
        this.nivel = 0;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNickname(){
        return this.nickname;
    }

    public void setNickname(String nick){
        this.nickname = nick;
    }

    public int getPontuacao(){
        return this.pontuacao;
    }

    public void setPontuacao(int pontuacao){
        this.pontuacao += pontuacao;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void aumentarPontuacao(){
        this.pontuacao++;
    }

    public void subirNivel(){
        if (pontuacao < 100) {
            System.out.println(this.nickname + ", você não tem pontos suficientes!");
        } else {
            int fator = pontuacao / 100;
            this.nivel += fator;
            this.pontuacao -= fator * 100;
            System.out.println("Parabéns, " + this.nickname + "! Você subiu de nível, e agora está no nível " + this.nivel + "!");
        }
    }

    public void bonus(int valor){
        this.pontuacao += valor;
        this.subirNivel();
    }
}
