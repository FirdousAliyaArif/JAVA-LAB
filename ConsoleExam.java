import java.io.Console;
class ConsoleExam
{
      public static void main(String[] ar)
      {
             System.out.println("using console");
             Console con = System.console();
             if (con!=null)
             {
                con.printf("Ener your name");
                String name = con.readLine();
                con.printf("Hello,%s",name);
             }
             else
             {
                System.out.println("console  not available");
             }
       }
}