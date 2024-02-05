// 6th Class
package Basic;

// Topic Inheritnece Starts from Here

// Type 1--Sinlge Inehertience
  public class cars {

    void speed(){
        System.out.println("120 k/hr");
    }

}


// Inheritence by using "EXTENDS"
class bikes extends cars
 {

     public static void main(String[] args) {
         System.out.println("Car Speed :");
         cars alto = new cars();
         alto.speed();
         System.out.println("Bike Speed :");
         bikes KTM = new bikes();

         KTM.speed();
     }
}
