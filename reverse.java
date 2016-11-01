import java.util.Scanner;
public class reverse
{
  public static void main(String[] args )
    {
    Scanner input = new Scanner(System.in);
    String original, reverse = "";
    System.out.print("Enter a string");
    System.out.println();
    original = input.nextLine();
    System.out.println();
    int length = original.length();
    if (original.isEmpty()){
        System.out.print("String is empty");
    }
    else {
        for ( int i = length - 1 ; i >= 0 ; i-- )
           reverse = reverse + original.charAt(i);
        System.out.println("Reverse of string is: "+reverse);                  
      }
  }
}
