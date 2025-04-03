class StringcompTo
{
      public static void main(String[] ar)
      {
             String s1 = "Hell";
             String s2 = "Hello";
             String s3 = "Hello";
             String s4 = "Tonight";
             System.out.println(s4.charAt(2));
             System.out.println(s1.compareTo(s2));
             System.out.println(s2.compareTo(s3));
             System.out.println(s1.compareTo(s3));
             System.out.println(s4.equalsIgnoreCase("TONIGHT"));
             System.out.println("Length of s4 is"+s4.length());
      }
}