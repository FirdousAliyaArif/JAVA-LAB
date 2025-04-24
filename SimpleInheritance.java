class Employee
{
      String name;
      double salary;
      void ShowDetails()
      {
           System.out.println("name:"+name);
           System.out.println("Salary:"+salary);
      }
}
class Developer extends Employee
{
      String prgLang;
      void ShowDeveloperInfo()
      {
           System.out.println(prgLang+" developer");
      }
}
public class SimpleInheritance
{
      public static void main(String[] ar)
      {
             Developer dev = new Developer();
             dev.name = "Aristotle";
             dev.salary = 800000;
             dev.prgLang = "python";
             dev.ShowDetails();
             dev.ShowDeveloperInfo();
       }
}
   