package Run_time;
//Second type-- Sequence of argument SAME

// Class 1
 public  class Gang {
    void Print(int a ,String b)
    {
        // Print statement
        System.out.println("Gang class");
    }
}

// Class 2
// Helper class
 class Road extends Gang {
    // Method
    void Print(int a,String b)
    { System.out.println("Road Gang1"); }
}
// Class 3
// Helper class
 class Gali extends Road {
    // Method
    void Print(int a, String b)
    {
        // Print statement
        System.out.println("Gali Road Gang2");
    }
}
// Class 4
// Main class
 class thief {
    // Main driver method
    public static void main(String[] args)
    {
        System.out.println("Class 1:");
        Gang a= new Gang();
        a.Print(2,"abc");
        System.out.println("Class 2:");
        Road b =new Road();
        b.Print(2,"abc");
        System.out.println("Class 3:");
        Gali c = new Gali();
        c.Print(2,"abc");
    }
}
