package this_super_keyword;

public class superkeyword {
    int i = 10;
}
class mani extends superkeyword{
    int i =20;

    void show(int i){
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        mani m =new mani();
        m.show(30);
    }
}
