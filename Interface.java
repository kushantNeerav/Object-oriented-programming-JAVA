/* Interfaces= It gives 100% data hiding facility
   properties:-
   1.Interface class initialize with "interface" keyword
   2.we can inherit interface class by using "implements" keyword
   3.We cannot make constructors in interface class
   4.Only abstract methods are allowed in interface class 
   (optional: we use abstract keyword before method or not it is not compulsary)   */

interface Car {   //initialize with interface

    void mailege();
    //Car()     = constructor are not possible

    abstract void speed();  // we can use abstract or not but all methods are abstract
}

class BMW implements Car {    //inherit by using impelemnts

    public void mailege() {
        System.out.println("7 KMPH");
    }

    public void speed() {
        System.out.println("240/KMPH");
    }
}

public class Interface implements Car {    //class name is jaguar but for complie run i make this Interface

    public void mailege() {
        System.out.println("4 KMPH");
    }

    public void speed() {
        System.out.println("320/KMPH");
    }

    public static void main(String[] args) {
        BMW b = new BMW();
        b.mailege();
        b.speed();
        Interface j = new Interface();
        j.mailege();
        j.speed();
    }

}
