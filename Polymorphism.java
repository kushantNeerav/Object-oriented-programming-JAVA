//   Polymorphism = Poly means many & morphism means forms (A work can be done in many forms in java called polymorphism)
//   Types:
//  ->Function Overloading / Method Overloading = it is compile time poly.. means it gives errors in compile time so we can easily 
// solve it and it runse smoothly
//  ->Function Overriding / Method Overriding   = it is run time poly..means incase code have errors than it gives during runnigf of code
// this type we see on Inheritance

// Complie time polymorphism:
// check uf one case is true about methods or not
// 1. Return type of methods must be different if paramters are same
// 2.if returntypes are same than parameters data types must be different
// .if returntypes and dataypes are same than number of parameters must be different
public class Polymorphism {     //Method overloading example

    public void show(String name) {
        System.out.println(name);
    }

    public void show(int age) {
        System.out.println(age);
    }

    public void show(String name, int age) {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        p.show("Kushant");
        p.show(21);
        p.show("Kushant" + " " + +21);
    }
}

//Method Overriding example:
// class Parent {
//     public void show() {
//         System.out.println("Parent");
//     }
// }
// public class Polymorphism extends Parent {
//     public void show() {
//         System.out.println("Child");
//     }
//     public static void main(String[] args) {
//         Polymorphism p = new Polymorphism();
//         // Parent p = new Parent();   it only gives parent when we make parent object
//         p.show();
//         // in this as both have same method so the inherit class override the method of parent class
//         //We see this in Inheritance topic
//     }
// }
