import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num;
    num= in.nextInt();

    do {
      int i = num;
      do{
        System.out.print("*");
        i--;
      }while(i>0);
      System.out.println();
      num--;
    } while(num > 0); 
    
  }
}
