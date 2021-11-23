package Aula14;

public class Principal {
    public static void main(String[] args) {
        Porto porto = new Porto("Puerto de Bs. As.");

        Container container1 = new Container(1, "Salmão", "Chile", false);
        Container container2 = new Container(2, "DVDs", "Desconhecido", false);
        Container container3 = new Container(5, "Mystery Meat", "Desconhecido", true);

        porto.addContainer(container1);
        porto.addContainer(container2);
        porto.addContainer(container3);

        porto.orderContainers();

        System.out.println(porto.getQuantidadeContainersPerigosos());
    }
}
