package studentinfo;
public class Eligible extends Student
{
        int marks;
        public Eligible(String name, int marks)
        {
               super(name);
               this.marks = marks;
        }
        public void checkEligible()
        {
               display();
               ShowRole();
               if(marks >= 40)
               {
                  System.out.println("Status:Eligible for exam");
               }
               else
               {
                  System.out.println("Status: Not Eligible for the exam");
               }
        }
}