package Run_time;

//First type--number of argument SAME

// Class 1
public class Parent {
    // Method of parent class
    void Print()
    {
        // Print statement
        System.out.println("parent class");
    }
}

// Class 2
// Helper class
class subclass1 extends Parent {
    // Method
    void Print()
    { System.out.println("subclass1"); }
}
// Class 3
// Helper class
class subclass2 extends Parent {
    // Method
    void Print()
    {
        // Print statement
        System.out.println("subclass2");
    }
}
// Class 4
// Main class
class GFG {
    // Main driver method
    public static void main(String[] args)
    {
       Parent a = new Parent();
       a.Print();
       subclass1 b =new subclass1();
       b.Print();
       subclass2 c = new subclass2();
       c.Print();
    }
}
