import java.util.*;
 public class TestPoint{
    public static void main(String args[]){
     
      Point point1=new Point(1,2);
      Point point2=new Point(2,3);
      Point p = new Point (2,5); 
      Point q = new Point (2,5); 
      Point pt=new Point(3,2);

 double distanceEntrePoints=point1.distance(point2);
 System.out.println("la disntance entre les points est :"+distanceEntrePoints);
 double distanceEntrePointsv2=Point.distance(point1 , point2);
  System.out.println("la disntance entre les points est :" +distanceEntrePointsv2);  
  System.out.println(q.equals(p));   
   System.out.println(q.equals(p)); 
    System.out.println(pt.toString());
 }
  }