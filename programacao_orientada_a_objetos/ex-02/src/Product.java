public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {

    }

    double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int qntd) {
        this.quantity += qntd;
    }

    public void removerProducts(int qntd) {
        if (qntd <= 0) {
            System.out.println("valor inválido");
        } else {
            quantity -= qntd;

        }
    }

    void imprimirInfo() {
        System.out.println("product: " + name);
        System.out.println("price: $ " + price);
        System.out.println("quantity: " + quantity);
        System.out.println("value total in stock: $ " + totalValueInStock());
        System.out.println("-------------------");
    }


    @Override
    public String toString() {
        return "Product: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity + " $ " +
                String.format("%.2f", totalValueInStock());
    }
}
