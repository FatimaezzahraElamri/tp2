import java.util.*;
public class Point{

  public Point(){
       this(0,0);
  }
public Point(double x,double y){
  this.x=x;
  this.y=y;
}

public Point(double x){
   this.x=x;
   this.y=0;
 }
private double x,y;

public double getx(){
      
    return x;

  }

public double gety(){
     return y;
  }
 public void setx(int X){ 
      this.x=X;
 }

 public void sety( int Y ){

    this.y=Y;
 }

public double distance(Point b){
     double ab=b.getx()-this.x;
     double ba=b.gety()-this.y; 
   return Math.sqrt(ab*ab+ba*ba);     
 }

 public static double distance(Point a, 
Point b) {

    double ab=b.getx()-a.getx();
     double ba=b.gety()-a.gety();
  return Math.sqrt(ab*ab+ba*ba);  

}
    public boolean equals(Object A) {
       return (this.x == ((Point) A).x && this.y == ((Point) A).y);
    }

    public boolean equals(Point a){
         return (this.x==a.x && this.y==a.y);        
     }
  
    public String toString(){
      return "("+x+","+y+")";
    }

}
