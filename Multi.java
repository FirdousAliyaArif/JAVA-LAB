class MultithreadingDemo extends Thread
{
      public void run()
      {
             try{
                  //displaying the thread that is running
                  System.out.println("Thread"+Thread.currentThread().getId()+"is running");
                 }
                 catch(Exception e)
                 {
                   //Throwing an exception
                   System.out.println("Exception is caught");
                  }
        }
}
public class Multi
{
       public static void main(String[] ar)
       {
              int n=8;//number of threads
              for(int i=0;i<8;i++)
              {
                MultithreadingDemo object=new MultithreadingDemo();
                object.start();
               }
       }
}