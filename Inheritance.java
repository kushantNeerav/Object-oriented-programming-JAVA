//Inheritance = One class property share to another class Is called Inheritance
//Types:

//1.Single-Level Inheritance
// class Shape {
//     public void show() {
//         System.out.println("Shape name displays here");
//     }
// }
// class Triangle extends Shape {
//     public void can() {
//         System.out.println("Triangle");
//     }
//     public static void main(String... s) {
//         Triangle t = new Triangle();
//         t.show();
//         t.can();
//     }
// }



//2.Multi-level Inheritance:- Means multple level of inheritance we see here like 1 is parent of 2
//  and 2 is parent of 3 ,3 is parent of 4
// class Geometry {                                                              //Great-Grand-father

//     public void geometry() {
//         System.out.println("It comprises of various shapes and formulas");
//     }
// }

// class Shapes extends Geometry {                                               //Grand-Father

//     public void shapes() {
//         System.out.println("Geometry Stores multiple shapes");
//     }
// }

// class Triangle extends Shapes {                                                //Father

//     public void trngle() {
//         System.out.println("Triangle is one of the Shape that present in Geometry");
//     }
// }

// class Equilateraltriangle extends Triangle {                                   //Child

//     public void eql() {
//         System.out.println("Equilateral-triangle is one of the form of triangle also called Shape that present in Geometry ");
//     }

//     public static void main(String[] args) {
//         Equilateraltriangle et = new Equilateraltriangle();
//         et.geometry();
//         et.shapes();
//         et.trngle();
//         et.eql();

//     }
// }



//3.Hierarchical Inheritance = One Parent class and many child class
// class Shape {
//     public void show() {
//         System.out.println("Shapes:");
//     }
// }
// class Circle extends Shape {
//     public void can() {
//         System.out.println("Round in shape");
//     }
// }
// class Square extends Shape {
//     public void man() {
//         System.out.println("Square in shape");
//     }
// }
// class Triangle extends Shape {
//     public void ran() {
//         System.out.println("3 edges shape");
//     }
//     public static void main(String[] args) {
//         Circle c = new Circle();    //Object make that call
//         c.can();                    //method of inherited class
//         c.show();                   //method of parent class
//         Square s = new Square();
//         s.show();
//         s.man();
//         Triangle t = new Triangle();
//         t.show();
//         t.ran();
//     }
// }
