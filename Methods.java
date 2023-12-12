public class Methods extends Product{
    public Methods(){

    }
    public void OutOfStock(Product product){
        if(product.getQuantity()==0){
            System.out.println("product out of stock");
        }
    }

    public void RunSlow(Product product){
        int threshold=2;
        if(product.getQuantity()<threshold){
            System.out.println("Product runs slow");

        }
    }
}
