package Compile_time;

public class Third_type {
    void ok(int p){
        System.out.println("Jai");
    }
    void ok(String t){
        System.out.println("Hanuman jii ");
    }



    public static void main(String[] args) {
        Third_type can = new Third_type();
        can.ok(45);
        can.ok("saw");
    }
}
