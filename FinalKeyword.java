/*
We can implement final keyword in :
1. Class= If we use final keyword before class name than that class cannot be inherited by any class
2. Method=If we use final keyword with method than that method cannot be Override by any other method
3. Variable= If we use final keyword before variable name than we cannot make changes in that variable means if 
             ex:- final int a=10;
             than we cannot change the value of a.. it is final(We cannot make empty final variable we must declare it with value)

 */
//                                                Final Variable
public class FinalKeyword {

    final int a = 10;
    a  = 20;
//                                                              We cannot change the value of final variable

    public static void main(String[] args) {
        FinalKeyword f = new FinalKeyword();
        //f.a=20;
    }
}
//                                                  Final Class

final class Parent {

    String name;
    int age;

    public void show() {
        System.out.println("Hello");
    }
}

public class FinalKeyword extends Parent {
//                                                                  we cannot inherit the final class

    public static void main(String[] args) {
    }
}

//                                                 Final Method
class Parent {

    public final void show() {
        System.out.println("Parent");
    }
}

public class FinalKeyword extends Parent {

    public void show() {
        //                                                                we cannot override the final method
        System.out.println("FinalKeyword");
    }

    public static void main(String[] args) {
        FinalKeyword f = new FinalKeyword();
        f.show();
    }
}
