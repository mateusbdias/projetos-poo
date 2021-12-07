package AulaRevisao;

public class OfertaAcadFactory {
    private static OfertaAcadFactory instance;

    private OfertaAcadFactory(){}

    public static OfertaAcadFactory getInstance(){
        if (instance == null){
            instance = new OfertaAcadFactory();
        }
        return instance;
    }

    public OfertaAcad criarOferta(String tipo){
        if (tipo.equals("C")){
            return new Curso();
        } else if (tipo.equals("P")){
            return new Programa();
        }
        return null;
    }
}