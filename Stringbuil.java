import java.util.*;
class Stringbuil
{
      public static void main(String[] ar)
      {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the string:");
             String s1 = sc.next();
             s1.concat("hey");
             System.out.println("String after concatenation is :"+s1);
             StringBuilder sb = new StringBuilder("hello");
             sb.append("hi");
             System.out.println("String after appending is :"+sb);
      }
}