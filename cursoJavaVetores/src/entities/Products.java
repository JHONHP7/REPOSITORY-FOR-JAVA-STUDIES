package entities;

public class Products {

    String name;
    private double price;
    private int quantity;

    /* default constructor */

    
    public Products(){    
    }

    /* custom constructors */
    public Products(String name, double price, int quantity) {
        /*word "this" is a reference to the
        object itself, differentiates attributes of
        local variables */
        
        this.name = name; // this serve for diferenciar o attributes do object do parameters  do constructor
        this.price = price;
        this.quantity = quantity;
           
    }
    public Products(String name, double price) {
        
        this.name = name; 
        this.price = price;
           
    }
    /* methods */
    
    public void setName(String name) { //change private name
        this.name = name;
    }
    public String getName() { //show name
        return name;
    }
    public double getPrice() { //show price
        return price;
    }
    public void setPrice(double price) { //change price
        this.price = price;
    }
    public double getQuantity() { //show quantity
        return quantity;
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
