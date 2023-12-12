public class Table extends Furniture{
    String shape;

    public Table(int ID, String name, int quantity, double price, double tax, String material, String dimension, String shape) {
        super(ID, name, quantity, price, tax, material, dimension);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }



    @Override
    public String toString() {
        return "Table{" +
                "shape='" + shape + '\'' +
                ", material='" + material + '\'' +
                ", dimension='" + dimension + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
