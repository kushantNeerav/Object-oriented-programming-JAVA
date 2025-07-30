//Classes and Objects

class Pen {                                             //Class 1

    String color;
    int price;

    public void show() {
        System.out.println(this.color);
        System.out.println(this.price);
    }
}

class Student {

    String name;
    int age;

    public void info() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class ClassObjects {

    public static void main(String... s) {
        Pen p1 = new Pen();                  //Object 1 of Class 1
        p1.color = "Red";
        p1.price = 880;
        p1.show();
        System.out.println();

        Pen p2 = new Pen();                  //Object 2 of Class 1
        p2.color = "White";
        p2.price = 1700;
        p2.show();
        System.out.println();

        Student s1 = new Student();
        s1.name = "Ram";
        s1.age = 21;
        s1.info();
        System.out.println();

        Student s2 = new Student();
        s2.name = "Laxman";
        s2.age = 20;
        s2.info();
    }
}
