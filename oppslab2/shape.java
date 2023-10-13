import java.util.*;
class shape1{
public int getArea(int s){
return s*s;
}
public int getPerimeter(int a){
return 4*a;
}
public double getArea(double r){
return 3.14*r*r;
}
public double getPerimeter(double r){
return 2*3.14*r;
}
public double getArea(double l,double b){
return l*b;
}
public double getPerimeter(double l,double b){
return 2*(l+b);
}
}
class shape{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
shape1 s=new shape1();
System.out.println("Side of a square");
int a=sc.nextInt();
System.out.println("AREA IS"+s.getArea(a));
System.out.println("perimeter is"+s.getPerimeter(a));
System.out.println("radius of a circle");
double r =sc.nextDouble();
System.out.println("AREA IS"+s.getArea(r));
System.out.println("perimeter is"+s.getPerimeter(r));
System.out.println("l of rectangle");
double l=sc.nextDouble();
System.out.println("b of rectangle");
double b =sc.nextDouble();
System.out.println("AREA IS"+s.getArea(l,b));
System.out.println("perimeter is"+s.getPerimeter(l,b));
}
}


