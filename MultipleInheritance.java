//Multiple Inheritance  =Multiple parents giving thier property to one child
//  we can do this with the help of interfaces

interface Animal {

    void walk();
}

interface Carnivore {

    void eats();
}

interface Dangerous {

    void body();
}

public class MultipleInheritance implements Animal, Carnivore, Dangerous {

    public void walk() {
        System.out.println("Lion has four legs and can walk");
    }

    public void eats() {
        System.out.println("Lion is carnivore in nature means eats only flesh ");
    }

    public void body() {
        System.out.println("Lion is very powerful animal");
    }

    public static void main(String[] args) {
        MultipleInheritance l = new MultipleInheritance();
        l.walk();
        l.eats();
        l.body();
    }

}
