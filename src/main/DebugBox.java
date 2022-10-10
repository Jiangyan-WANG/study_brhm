package main;

public class DebugBox
{
   public static void main(String[] args) {
      DebugBox testDebug = new DebugBox();
      DebugBox testDebug2 = new DebugBox(2,3,4);
      testDebug.showData();
      System.out.println("Volume:" + testDebug.getVolume());

      testDebug2.showData();
      System.out.println("Volume:" + testDebug2.getVolume());


   }
   private int width;
   private int length;
   private int height;
   public DebugBox()
   {
      this.length = 1;
      this.width = 1;
      this.height = 1;
   }
   public DebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length;
      this.height = height;
   }
   public void showData()
   {
      System.out.println("Width: "  + this.width + "  Length: " +
        this.length + "  Height: " + this.height);
   }
   public double getVolume()
   { 
      double vol = this.length * this.width * this.height;
      return vol;
   }
}
