public class Product {
    int ID;
    String name;
   public  int quantity;
    double price;
    double tax;
Product(){

}
    public Product(int ID, String name, int quantity, double price, double tax) {

        this.ID =ID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.tax = tax;
    }


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public boolean equals(Object obj) {
    Product p=(Product)obj;
        if( p.getID().equals(((Product) obj).getID())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
