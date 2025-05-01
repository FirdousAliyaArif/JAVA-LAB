class Multithread implements Runnable
{
      public void run()
      {
         System.out.println("Thread is running...");
      }
      public static void main(String[] ar)
      {
             Multithread m1=new Multithread();
             Thread t1=new Thread(m1);
             t1.start();
      }
}