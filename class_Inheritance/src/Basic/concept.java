// concept of java starts from here
// 1st Class
package Basic;



public class concept {

//    Method
    public  void eat()
    {
//       Function
        System.out.println("I am eating");
    }
    public static void main(String[] args) {
        System.out.println("Animal");
//      object making
        concept Tuffy = new concept();
        Tuffy.eat();
        Tuffy.run();

//      New Object
        concept Angaad = new concept();
        Angaad.eat();


//      Creating Birds class Object

        Birds sparrow = new Birds();
        sparrow.fly();
    }
//    Method
    public void run()
    {
//        Function
        System.out.println("i am running");
    }
}
