import java.util.Scanner;
public class numberofwords
{
  public static void main(String[] args )
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a saying");
    System.out.println();
    String saying = input.nextLine();
    System.out.println();
    System.out.print("Your saying has " + countWords(saying) + " words.");
    }
  public static int countWords(String str)
    {
        int count = 1;
        for (int i=0;i<=str.length()-1;i++)
        {
            if (str.charAt(i) == ' ' && str.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return count;
      }
    }
