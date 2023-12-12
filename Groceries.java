public class Groceries extends Product{
     Date ExpireDate;
     Date ManuFactureDate;



    public Groceries(int ID, String name, int quantity, double price, double tax, Date expireDate, Date manuFactureDate) {
        super(ID, name, quantity, price, tax);
        ExpireDate = expireDate;
        ManuFactureDate = manuFactureDate;
    }

    public Date getExpireDate() {
        return ExpireDate;
    }

    public Date getManuFactureDate() {
        return ManuFactureDate;
    }

    @Override
    public String toString() {
        return "Groceries{" +
                "ExpireDate=" + ExpireDate +
                ", ManuFactureDate=" + ManuFactureDate +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
