package this_super_keyword;

public class case3 {
    case3(){
//        this(10);
        System.out.println("no argument constructor");
    }
    case3(int a){
        this();
        System.out.println("Parameterised constructor");
    }

    public static void main(String[] args) {
//        case3 j=new case3();
        case3 j=new case3(10);

    }
}
