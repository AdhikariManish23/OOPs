package this_super_keyword;

public class case1 {
    int i ;
    void satvalue(int i){
        this.i = i; // here if we dont use this then the ans will be 0 or either we have to change the variable
    }
    void show(){
        System.out.println(i);
    }

    public static void main(String[] args) {


        case1 d=new case1();
        d.satvalue(10);
        d.show();
    }
}
