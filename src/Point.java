public class Point {
   private int x, y;
   
   //Constructor
   public Point(int theX, int theY){
       x = theX;
       y = theY;
   }
   
   //Adds amount to the x value
   public void shiftRight(int amount){
       x += amount;
       
   }
   
   
   //Returns this Point as a String
   public String toString(){
       return "(" + x + ", " + y + ")";
   }
   
   //Determines logical equality of this Point and otherPoint
   public boolean equals(Point otherPoint){
       return toString().equals(otherPoint.toString());
   }
   
}