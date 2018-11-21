import java.util.Scanner;

public class Foothill
{
   public static void main(String[] args)
   {
      int year, result;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Please type a year: ");
      year = input.nextInt();
      
      result = year % 4;
      
      if ((result == 0) && (year > 0))
         System.out.print("You have entered a leap year :)");
      else if (year < 1 )
         System.out.print("Unfortunately, you entered an invalid year!");
      else
         System.out.print("You have not entered a leap year :("); 
      
      input.close();
   }
   
}
/* -------------------- paste of run 1 from console window -------------------------

Please type a year: 2020
You have entered a leap year :)

---------------------------------------------------------------------------------*/
/* -------------------- paste of run 2 from console window -------------------------

Please type a year: 3333
You have not entered a leap year :(

---------------------------------------------------------------------------------*/
/* -------------------- paste of run 3 from console window -------------------------

Please type a year: -1
Unfortunately, you entered an invalid year!

---------------------------------------------------------------------------------*/