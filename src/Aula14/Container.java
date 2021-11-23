package Aula14;

public class Container implements Comparable<Container> {
    private int numID;
    private String descricao;
    private String paisOrigem;
    private boolean matPerigosos;

    public Container(int numID, String descricao, String paisOrigem, boolean matPerigosos) {
        this.numID = numID;
        this.descricao = descricao;
        this.paisOrigem = paisOrigem;
        this.matPerigosos = matPerigosos;
    }

    @Override
    public int compareTo(Container o) {
        if (this.numID == o.numID){
            return 0;
        }else if (this.numID > o.numID){
            return 1;
        }else{
            return -1;
        }
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean isMatPerigosos() {
        return matPerigosos;
    }

    public void setMatPerigosos(boolean matPerigosos) {
        this.matPerigosos = matPerigosos;
    }
}
