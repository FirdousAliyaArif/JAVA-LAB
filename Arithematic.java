import java.util.Scanner;
class Arithematic
{
      public static void main(String[] ar)
      {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the value of a:");
             int a = sc.nextInt();
             System.out.println("Enter the value of b:");
             int b = sc.nextInt();
             System.out.println("**Arithematic operations**1.Addition2.Subtraction3.Multiplication");
             System.out.println("Enter your choice:");
             int ch = sc.nextInt();
             switch(ch)
             {
                   case 1:
                    System.out.println("Result is" + (a+b));
                    break;
                   case 2:
                    System.out.println("Result is" + (a-b));
                    break;
                   case 3:
                    System.out.println("Result is" + (a*b));
                    break;
                   default:
                    System.out.println("Invalid Input");
                    break;
              }
      }
}

