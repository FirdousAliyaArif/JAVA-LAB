class StringBuffExample
{
      public static void main(String[] ar)
      {
             StringBuffer   sb = new StringBuffer("Hello world");
             sb.append("Example");
             System.out.println("The modified string is:"+sb);
             System.out.println("Capacity of the string is:"+sb.capacity());
             System.out.println("the reversed sstring is:"+sb.reverse());
             System.out.println("The replaced string is:"+sb.replace(2,5,"appy"));
             System.out.println("Iserting in the string:"+sb.insert(6,"hi there")); 
      }
}