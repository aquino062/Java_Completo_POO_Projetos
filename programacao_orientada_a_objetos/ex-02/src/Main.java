
public class Main {
    public static void main(String[] args) {


        Product p1 = new Product("celular",5.00,10);

        p1.imprimirInfo();
        p1.addProducts(10);
        p1.imprimirInfo();
        p1.removerProducts(1);
        p1.imprimirInfo();

        System.out.println(p1);


    }
}