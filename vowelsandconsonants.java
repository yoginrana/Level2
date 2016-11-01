import java.util.Scanner;
public class vowelsandconsonants
{
  public static void main(String[] args )
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string");
    System.out.println();
    String word = input.nextLine();
    System.out.println();
    int count = 0;
    int vowels = 0;
    int consonants = 0;
    for (String retval: word.split(" ")){
       for (int i = 0; i < retval.length(); i++)
       {
         char ch = retval.charAt(i);
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
          {
            vowels++;
          }
         else
          { 
            consonants++;
          }
         }
       System.out.println(retval.substring(0, 1).toUpperCase() + retval.substring(1)+" has "+vowels+" vowels and "+consonants+" cosonants");
       vowels=0;
       consonants=0;
      }
  }
}
     
 
           