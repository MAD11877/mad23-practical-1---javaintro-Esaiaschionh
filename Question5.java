import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    //System.out.println("Enter number: "); 
    int num;
    num = in.nextInt();
    List<Integer> numbers = new ArrayList<>();
    do{
      //System.out.print(">");
      int a = in.nextInt();
      numbers.add(a);
      num--;
    }while (num>0);
    
    Map<Integer, Integer> frequency = new HashMap<>();
    for (int n : numbers) {
      if (frequency.containsKey(n)) {
        frequency.put(n, frequency.get(n) + 1);
      } else {
      frequency.put(n, 1);
      }
    }

    int mode = 0;
    int maxFrequency = 0;
    for (Entry<Integer, Integer> entry :  frequency.entrySet()) {
      if (entry.getValue() > maxFrequency) {
        mode = entry.getKey();
        maxFrequency = entry.getValue();            
      }
    }
    System.out.println(mode);
    
  }
}
