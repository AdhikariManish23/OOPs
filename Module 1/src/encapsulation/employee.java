package encapsulation;

public class employee {
    private int empid;
    public void setEmpid(int eid){
        empid = eid;
    }
    public int getEmpid() {
        return empid;
    }
}
class  Company{
    public static void main(String[] args) {
        employee e =new employee();
        e.setEmpid(110);
        System.out.println(e.getEmpid());
}
}
