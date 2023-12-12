public class AudioDevice extends Electronics{

    public AudioDevice(int ID, String name, int quantity, double price, double tax, String warranty, String powerConsumption) {
        super(ID, name, quantity, price, tax, warranty, powerConsumption);
    }

    @Override
    public String toString() {
        return "AudioDevice{" +
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
