package interfaces;

interface I1 {
/* 1. here we can use void/public/abstract

   2. by using default key word we can make concrete method
     default void show(){
     System.out.println(" ");
     }
   3. static void display(){
      sop
   }
   4. public static final int a = 10; in default when we create variable
   5. by ,default it is taking public
  */
     void show();
}

interface I2{
    void display();
}

// Multiple Interfernece use

class gas implements I1,I2
{

    //it is compulsory to make child class method equal or bigger than parent class method

    public void show(){
        System.out.println("hello");
    }


    public void display() {
        System.out.println("world");
    }

    public static void main(String[] args) {
        gas g= new gas();
        g.show();
        g.display();
    }
}

