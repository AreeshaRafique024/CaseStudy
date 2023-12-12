public class Furniture extends Product {
   String material;
   String dimension;


    public Furniture(int ID, String name, int quantity, double price, double tax, String material, String dimension) {
        super(ID, name, quantity, price, tax);
        this.material = material;
        this.dimension = dimension;
    }

    public String getMaterial() {
        return material;
    }

    public String getDimension() {
        return dimension;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", dimension='" + dimension + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
