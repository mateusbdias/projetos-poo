package Aula12Mesa;

public class Principal {
    public static void main(String[] args) {
        Administrativo assistenteAdm = new Administrativo("José da Silva",
                2021.00, 98765, true, 200.00);
        Tecnico assistenteTec = new Tecnico("Maria de Souza", 2300.00,
                65432, 150.00);
        assistenteAdm.exibeDados();
        assistenteAdm.ganhoAnual();
        assistenteTec.exibeDados();
        assistenteTec.ganhoAnual();
    }
}
