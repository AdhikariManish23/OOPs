package abstraction;


// abstract method
abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("car starts with key");
    }
}
class scooter extends Vehicle{
    void start(){
        System.out.println("Scooter starts with kick");
    }

    public static void main(String[] args) {
       Car c=new Car();
       c.start();

       scooter s =new scooter();
       s.start();
    }
}
