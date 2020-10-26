import java.util.Scanner;
/**
 * Class BoardFoot
 */
 
 /**
* @author  John Omage
* @version 1.0
* @since   2020-10-16
*/
public class BoardFoot {
  public static void main(String[] args) {
    
    Scanner userInput = new Scanner(System.in);
      
    //Declare the variable
    float length;
    float weight;
    float inches;
    float userlength;
    float userweight;
    float Height;
    
    //This tells the user to enter the frist dimension
    System.out.println("Enter the frist dimesion:");
    userlength = userInput.nextInt();
    
    //This tells the user to enter the weight
    System.out.println("Enter the Second dimesion:");
    userweight = userInput.nextInt();
    
    //This calculates the dimension
    Height = 144 / (userlength * userweight);
    
    //This display the total
    System.out.println(" The Height is " + Height + " inches ");
    
  }
}