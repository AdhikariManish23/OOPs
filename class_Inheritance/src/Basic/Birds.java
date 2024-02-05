// 2nd  Class
package Basic;

// Related to concept class

public class Birds {
    public void fly(){
        System.out.println("I am Flying");
    }

    public static void main(String[] args) {
        System.out.println("Birds");
        Birds sparrow = new Birds();
        sparrow.fly();
        sparrow.eat();
    }
    public void eat(){
        System.out.println("I am Eating");
    }
}
