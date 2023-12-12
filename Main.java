public class Main {
    public static void main(String[] args) {

        Inventory inventory=new Inventory(5);
        Methods m=new Methods();
        Product p1=new Seating(2,"aa",2,22,3,"ss","2s","2");
        Product p2=new AudioDevice(3,"qqq",1,233,3,"3d","3edf");
        Product p3=new Seating(2,"aa",2,22,3,"ss","2s","2");
        Product p4=new AudioDevice(3,"qqq",1,233,3,"3d","3edf");
        Product p5=new Seating(2,"aa",2,22,3,"ss","2s","2");


        inventory.add(p1);
        inventory.add(p2);
        inventory.add(p3);
        inventory.add(p4);
        inventory.add(p5);
        m.OutOfStock(p1);
        m.RunSlow(p2);

        inventory.display();

        inventory.remove(p2);


    }
}