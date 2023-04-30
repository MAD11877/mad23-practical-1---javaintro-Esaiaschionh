import java.util.Scanner;

public class Question2
{
  public static void main(String[] args) {    
    Scanner in = new Scanner(System.in);
    
    //Height prompt
    //System.out.println("Enter height (m): "); 
    double height = in.nextDouble();

    //Weight prompt
    //System.out.println("Enter weight (Kg): ");
    double weight = in.nextDouble();

    //BMI calculation & output
    double bmi = weight/(height * height);
    System.out.println(bmi);
  }
}
