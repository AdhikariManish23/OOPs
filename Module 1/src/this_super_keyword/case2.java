package this_super_keyword;

public class case2 {
    void display(){
        System.out.println("Hello");
    }
    void shoe(){
        this.display(); // by default here it takes this keyword, writing display it work same
    }

    public static void main(String[] args) {
        case2 c=new case2();
        c.shoe();
    }
}
