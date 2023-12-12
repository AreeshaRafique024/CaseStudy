public class Smartphone extends Electronics{
    String OS;
    String camera;
    String storage;

    public Smartphone(int ID, String name, int quantity, double price, double tax, String warranty, String powerConsumption, String OS, String camera, String storage) {
        super(ID, name, quantity, price, tax, warranty, powerConsumption);
        this.OS = OS;
        this.camera = camera;
        this.storage = storage;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "OS='" + OS + '\'' +
                ", camera='" + camera + '\'' +
                ", storage='" + storage + '\'' +
                ", warranty='" + warranty + '\'' +
                ", powerConsumption='" + powerConsumption + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
