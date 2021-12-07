package AulaRevisao;

public class Teste {
    public static void main(String[] args) {
        Instituto instituto = new Instituto("DH");
        OfertaAcadFactory factory = OfertaAcadFactory.getInstance();

        OfertaAcad oferta1 = factory.criarOferta("C");
        OfertaAcad oferta2 = factory.criarOferta("C");
        OfertaAcad oferta3 = factory.criarOferta("P");

        oferta1.setNome("Front End");
        oferta1.setDescricao("Curso de Front End");
        ((Curso)oferta1).setValorHora(45.5);
        ((Curso)oferta1).setCargaHoraria(20);
        ((Curso)oferta1).setDuracao(3);

        oferta2.setNome("Back End");
        oferta2.setDescricao("Curso de Back End");
        ((Curso)oferta2).setValorHora(60);
        ((Curso)oferta2).setCargaHoraria(25);
        ((Curso)oferta2).setDuracao(3);

        oferta3.setNome("Full Stack");
        oferta3.setDescricao("Programa de Full Stack");
        ((Programa)oferta3).setDesconto(0.3);
        ((Programa)oferta3).addCurso(oferta1);
        ((Programa)oferta3).addCurso(oferta2);

        ((Programa)oferta3).listarCursos();
        System.out.println("===============");
        instituto.addOferta(oferta1);
        instituto.addOferta(oferta2);
        instituto.addOferta(oferta3);
        instituto.listarOfertas();
    }
}
