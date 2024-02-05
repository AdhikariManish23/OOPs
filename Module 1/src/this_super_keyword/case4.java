package this_super_keyword;

public class case4 {
    void m1(case4 gh){
        System.out.println("Jai Mata Dii");
    }
    void m2(){
        m1(this);
    }

    public static void main(String[] args) {
        case4 tx=new case4();
        tx.m2();
    }
}
