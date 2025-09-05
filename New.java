
public class New {

    String name;
    int price;
    static String brand;

    public void show() {
        System.out.println(name + " : " + price + " : " + brand);
    }

    public static void main(String[] args) {
        New.brand = "Microsoft";
        New obj1 = new New();
        obj1.name = "16pro";
        obj1.price = 1211;
        //  New.brand = "Apple";
        obj1.show();

        New obj2 = new New();
        obj2.name = "15pro";
        obj2.price = 1111;
        //   obj2.brand = "Samsung";
        obj2.show();

    }
}
