package entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    /* construtor */
    public Products(String name, double price, int quantity) {
        /* palavra this é uma referência para o 
        próprio objeto, diferencia atributos de 
        variáveis locais */
        
        this.name = name; // this serve para diferenciar o atributo do objeto do parametro do construtor
        this.price = price;
        this.quantity = quantity;
           
    }
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
