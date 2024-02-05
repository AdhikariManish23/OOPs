package Compile_time;

public class Second_type {
    void view(int d,String e){
        System.out.println("Bolo");
    }
    void view(String q , int w){
        System.out.println("Radhe Radhe");
    }

    public static void main(String[] args) {
        Second_type sam = new Second_type();
        sam.view("car",10);
        sam.view(10,"man");

    }
}
