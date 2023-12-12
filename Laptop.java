public class Laptop extends Electronics {
    String RAM;
    String ProcessorSize;
    String screenDimension;

    public Laptop(int ID, String name, int quantity, double price, double tax, String warranty, String powerConsumption, String RAM, String processorSize, String screenDimension) {
        super(ID, name, quantity, price, tax, warranty, powerConsumption);
        this.RAM = RAM;
        ProcessorSize = processorSize;
        this.screenDimension = screenDimension;
    }

    public String getRAM() {
        return RAM;
    }

    public String getProcessorSize() {
        return ProcessorSize;
    }

    public String getScreenDimension() {
        return screenDimension;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "RAM='" + RAM + '\'' +
                ", ProcessorSize='" + ProcessorSize + '\'' +
                ", screenDimension='" + screenDimension + '\'' +
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
