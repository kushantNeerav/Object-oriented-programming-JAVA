
/*    Encapsulation = Encapsulation is all about hiding the internal state of an object and only 
                      allowing controlled access through defined methods.It helps protect data from 
                      unintended interference and keeps your code organized and secure.

                      
                      
                      
                      It means combining data and its functions/methods in a single entity
                      or properties and methods are combining in a single unit or capsule.   
                         (Encapsulation is used in Data Hiding)                                  */ //Local Variable = The variable that is declared inside a method
//Instance variable = The variable that declared inside the class but outside the method
//We can asscess objects within same class:           
// CASE 1
class Encapsulation {

    private String name;
    private int age;

    public static void main(String[] args) {
        Encap obj = new Encap();
        obj.name = "Kushant";
        obj.age = 21;
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
//                                         CASE 2

class Parent {

    private String name = "Kushant";                 //we cannot access private objects of differet classes
    private int age = 21;

    public String getname() {                   //by (get)/Getters we can easily read the values that user makes private
        return name;
    }

    public int getage() {
        return age;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Parent obj = new Parent();
        // obj.name = "Kushant";
        // obj.age = 21;
        // System.out.println(obj.name);
        // System.out.println(obj.age);
        System.out.println(obj.getname());
        System.out.println(obj.getage());
    }
}
//                                          CASE 3

/*     Incase if user dont describe values and i want to print my values:
              Setters come:-   */
class Big {

    private String name;
    private int age;

    public String getname() {            //use getters to access private
        return name;
    }

    public int getage() {
        return age;
    }

    public void setname(String n) {             //use setters to set values in private things
        name = n;
    }

    public void setage(int a) {
        age = a;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Big obj = new Big();
        obj.setname("Anant");                  //to set name & age 
        obj.setage(21);
        System.out.println(obj.getname());       //to print the name and age
        System.out.println(obj.getage());

    }
}

/*                                        CASE 4
If user set the values in private so we can also change it :-
Setters are used to set values and we can also change the values according to our need   */
class Case4 {

    private String name = "Kushant";
    private int age = 11;

    public String getname() {            //use getters to access private
        return name;
    }

    public int getage() {
        return age;
    }

    public void setname(String n) {             //use setters to set values in private things
        name = n;
    }

    public void setage(int a) {
        age = a;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Case4 obj = new Case4();
        obj.setname("Mukesh");                  //to set name & age 
        obj.setage(45);
        System.out.println(obj.getname());       //to print the name and age
        System.out.println(obj.getage());

    }
}
