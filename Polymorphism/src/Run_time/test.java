package Run_time;

public class test {
    void show(){
        System.out.println("1");
    }
}
class xyz extends test{
    void show(){
        super.show(); //wtih the help of this we can call Parent class method inchild class
        System.out.println("2");
    }

    public static void main(String[] args) {
        xyz x =new xyz();
        x.show();
    }
}
