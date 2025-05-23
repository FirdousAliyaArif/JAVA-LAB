abstract class Shape
{
         abstract double area();
         void display()
         {
              System.out.println("Displays the area of shape");
         }
}
class Circle extends Shape
{
      private double radius;
      Circle(double radius)
      {
            this.radius = radius;
       }
       double area()
       {
             return Math.PI*radius*radius;
        }
}
public class AbstractExample
{
      public static void main(String[] ar)
      {
             Shape circle = new Circle(5.5);
             System.out.println("Area of Circle is"+circle.area());
             circle.display();
        }
}