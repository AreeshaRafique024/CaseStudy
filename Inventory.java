import java.security.PublicKey;

public class Inventory {
    Product[] product;

    int counter = 0;

    public Inventory(int size) {

        this.product = new Product[size];
        counter++;

    }

    public boolean add(Object o) {
        if (counter < product.length) {
            product[counter] = (Product) o;
            counter++;
            return true;
        }
            return false;

    }

    public boolean remove(Object o) {
        for (int i = 0; i < product.length; i++) {
            Product p = product[i];
            if (p.equals(o) || p != null) {
                product[i] = null;
                return true;
            }
        }

        return false;
    }


    public void display(){
        for(Product p:product){
            if(p!=null){
            System.out.println(p);}
        }
    }

}

