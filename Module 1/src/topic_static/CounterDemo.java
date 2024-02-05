package topic_static;

public class CounterDemo {
//    int count = 0; if you used this it will give you 1 1 1 as a output
    static int count = 0;
    CounterDemo(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        CounterDemo c1 =new CounterDemo();
        CounterDemo c2 =new CounterDemo();
        CounterDemo c3 =new CounterDemo();
    }
}
