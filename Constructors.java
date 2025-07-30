//Constructors= They are used to create objects in java
/* properties: Must have same name that class have
               constructs not used any return type while initializing like int float
               Only calls one time when object creates */

class Vehicle {
    String name;
    int mileage;
    int price;
    String color;
    Vehicle() {
        System.out.println("Vehicle Details:");       //Non parameterized constructor
    }
    Vehicle(int price, String color) //Parameterized Constructor
    {
        this.price = price;            
        this.color = color;
    }                                       //Why java not have destructors to destroy the constructos
}                                           //that not in use:
                                            //bcoz Java have Garbage collectors inbuilt that destroy the objects tha not in use
public class Constructors {
    public static void main(String... s) {
        Vehicle v = new Vehicle(77, "Black");                                                                      
        v.name = "Mercedes";
        v.mileage = 7;
        System.out.println(v.name);
        System.out.println(v.mileage);
        System.out.println(v.price);
        System.out.println(v.color);
    }
}

//Another way to attain Parameterized constructor
// class Student {

//     String name;
//     char section;

//     Student(String name, char section) {
//         this.name = name;
//         this.section = section;
//     }

//     public void show() {
//         System.out.println(this.name);
//         System.out.println(this.section);
//     }
// }

// public class Constructors {

//     public static void main(String[] args) {
//         Student s1 = new Student("Kushant", 'B');
//         Student s2 = new Student("Diksha", 'C');
//         s1.show();
//         s2.show();
//     }
// }
