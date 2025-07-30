/* Abstraction= Hiding the un-necessary part of code and show the important things to user 
      properties of Abstraction:-
      1.abstarct class must be declared with abstract keyword
      2.abstract class can contain both abstract and non-abstract methods 
      3.We cannot make object of abstract class                     
      4.We can also make constructors in abstract classes   
      exception:- abstraction not provide 100% data hiding thats why we use interfaces in java */

abstract class Animal {   //abstract class declared with bstract keyword

    abstract void walk();

    Animal() {
        System.out.println("You are creating a new Animal");    // make constructor in absrtrct class
    }

    public void eats() {
        System.out.println("Animal eats");      //abstract class contain non-abstract method
    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse:-");
    }

    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class Abstraction extends Animal {

    Abstraction() {
        System.out.println("Chicken:-");
    }

    public void walk() {
        System.out.println("Walk on two legs");
    }

    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk(); //abstract method
        h.eats(); //non-abstract method
        Abstraction c = new Abstraction();
        c.walk();
        c.eats();
        // Animal a=new Animal();  here we cannot make object of abstract class

    }
}

//here we see first base class constructor call than derieved class constructor calls= it is called constructor chaining in java
