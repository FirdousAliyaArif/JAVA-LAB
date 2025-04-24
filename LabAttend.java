import java.io.*;
class LabAttend extends Exception
{
      LabAttend(String str)
      {
                super(str);
      }
      public static void main(String[] ar) throws IOException
      {
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter the record submission status as (True/False)");
             String ans=br.readLine();
             boolean recordSubmitted=ans.equalsIgnoreCase("False");
             try
             {
               System.out.println("Enter the held classes");
               double h=Double.parseDouble(br.readLine());
               System.out.println("Enter the attended classes:");
               double at=Double.parseDouble(br.readLine());
               double p=(at/h)*100;
               System.out.println("percentage is "+p);
               if(p<75)
               {
                 LabAttend lat=new LabAttend("YOU ARE NOT ALLOWED FOR JAVA LAB EXAM");
                 throw lat;
               }
               }catch(LabAttend la)
               {
                 System.out.println(la);
               }
               catch(IOException ie)
               {
                 System.out.println(ie);
               }
               finally
               {
                  if(recordSubmitted)
                  {
                    System.out.println("YOU ARE NOT ALLOWED FOR THE EXAM WITHOUT RECORD");
                  }
                  else
                  {
                    System.out.println("YOU ARE ALLOWED FOR THE LAB EXAM ONLY IF YOU HAVE THE RECORD AND ATTENDANCE");
                  }
               }
       }
}