package main;

public class DebugCircle
{
   private int radius;
   private int diameter;
   private final double PI = 3.14159;
   private double area;
   public DebugCircle(int r)
   {
      radius = r;
      diameter = 2 * r;
      area = PI * r * r;
   }

   public int getRadius()
   {
      return this.radius;
   }
   public int getDiameter()
   {
      return this.diameter;
   }
   public double getArea()
   {
      return area;
   }
}