package Compile_time;

// String Buffer

public class Cases_1 {
    void show(StringBuffer a) {
        System.out.println("StringBuffer Method");
    }

    void show(String a) {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        Cases_1 first = new Cases_1();
        first.show("abc");
        first.show(new StringBuffer("abc")); // or case1.show((String) "abc");
//      case1.show(); it will not run because compiler got confuse what to choose
    }
}
