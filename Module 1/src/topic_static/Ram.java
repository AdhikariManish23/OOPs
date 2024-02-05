package topic_static;

public class Ram {
    int empid;
    String name;
//    String company;
    static String company ="Smart company";

    Ram(int empid,String name){
        this.empid = empid;
        this.name = name;
//        this.company = company;

    }
    void display(){

        System.out.println(empid+" "+name+" "+company);
    }

    public static void main(String[] args) {
//      Ram r1 = new Ram(101,"amit","smart company");
        Ram r1 = new Ram(101,"amit");
        r1.display();
        Ram r2 = new Ram(102,"raju");
        r2.display();
    }


}
