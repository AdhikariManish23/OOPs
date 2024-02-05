package this_super_keyword;

public class super_constructor {
    super_constructor(){
        System.out.println("i am in class 1st");
    }
}
class snap extends super_constructor{
    snap(){
//        super(); with or without using this it prints first parent class constructor
        System.out.println("I am in class 2nd");
    }

    public static void main(String[] args) {
        snap s = new snap();
    }
}
