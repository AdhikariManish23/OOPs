package Compile_time;

public class First_type {

    void show(int a){
        System.out.println("Bolo");
    }
    void show(int b,int c){
        System.out.println("Jai Shree Ram");
    }

    public static void main(String[] args) {
        First_type one = new First_type();
//        call 1st show
        one.show(1);
//        call 2nd show
        one.show(1,2);
    }
}
