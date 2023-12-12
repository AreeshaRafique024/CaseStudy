public class Seating extends Furniture {

    String loadCapacity;

    public Seating(int ID, String name, int quantity, double price, double tax, String material, String dimension, String loadCapacity) {
        super(ID, name, quantity, price, tax, material, dimension);
        this.loadCapacity = loadCapacity;

    }

    public String getLoadCapacity() {
        return loadCapacity;
    }



    @Override
    public String toString() {
        return "Seating{" +
                "loadCapacity='" + loadCapacity + '\'' +
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