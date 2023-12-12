public class Electronics extends Product{
    String warranty;
    String powerConsumption;


    public Electronics(int ID, String name, int quantity, double price, double tax, String warranty, String powerConsumption) {
        super(ID, name, quantity, price, tax);
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    public String getWarranty() {
        return warranty;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "warranty='" + warranty + '\'' +
                ", powerConsumption='" + powerConsumption + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
