package Compile_time;

// varargs types case

public class Cases_3 {
    void black(int a){
        System.out.println("int method");
    }
    void black(int... a){
        System.out.println("Varargs Method");
    }

    public static void main(String[] args) {
        Cases_3 push = new Cases_3();
        push.black(10);
        push.black(12,323,545,64);
        push.black(); // it prints varargs method
    }
}
