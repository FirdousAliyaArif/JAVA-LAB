import java.util.Scanner;
public class InputMethods
{
       public static void main(String[] args)
       {
                                                                                                   
              Scanner scanner= new Scanner(System.in);
       //Basic Input Methods
              System.out.println("Enter your name:");
              String name=scanner.next();
              scanner.nextLine();
              System.out.println("Enter your college name:");
              String college=scanner.nextLine();//Read the whole line
              System.out.println("Enter your RollNumber:");
              int RollNum=scanner.nextInt();
              System.out.println("Enter your 1st year marks percentage:");
              float marks=scanner.nextFloat();// variable declaration
              scanner.close();
              System.out.println("-----Your Details-----\n");
              System.out.println("Name:" + name);
              System.out.println("\nCollege:" + college);
              System.out.println("\nRollNo:" + RollNum);
              System.out.println("\nPercentage:" + marks);
        }
}
              
              