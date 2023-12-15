package tpsjava2;
import java.util.*;
import java.awt.Point;
public class Rectangle{
private Point hg;
private Point bd;

public Rectangle(){
    this(0,0);
 }
public Point gethg(){
  return hg;
 }
public Point getbd(){
  return bd;
 }
public void sethg(Point hg){
   this.hg=hg;
}
public void setbd(Point bd){
   this.bd=bd;
}

public Rectangle(Point h,Point b){
   this.hg=h;
   this.bd=b;
   }


public void afficher(){
      
     System.out.println(this.hg.toString() +","+this.bd.toString());
   }
public double surface(){
      double l, L;
        l = this.hg.getX() - this.bd.getX();
        L = this.hg.getY() - this.bd.getY();
        return Math.abs(l * L);
   }
public void zoom(double DX,double DY){
// modification sur bas droit
        bd.sety(bd.gety() - DY);
        bd.setx(bd.getx() + DX);
        // modification sur haut gauche
        hg.setx(hg.getx() - DX);
        hg.sety(hg.gety() + DY);
   }


}