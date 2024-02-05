// 5th Class
package Basic;

//  3. Constructor

public class Employee {
    String name;
    int emp_id;

//  Constructor
    Employee(String name , int emp_id){
        this.name   = name;
        this.emp_id = emp_id;

    }
//  Default
    Employee(){
        this.name="John";
        this.emp_id=14;
    }

    public static void main(String[] args) {
        Employee E1 = new Employee("manish",11);
        Employee E2 = new Employee("ramesh",12);
        Employee E3 = new Employee("kamlesh",13);
//      default
        Employee E4 = new Employee();
        System.out.println(E1.name+" "+E1.emp_id);
        System.out.println(E2.name+" "+E2.emp_id);
        System.out.println(E3.name+" "+E3.emp_id);
        System.out.println(E4.name+" "+E4.emp_id);

    }
}
