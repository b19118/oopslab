import java.util.*;
public class p1{
public static class circle{
float radius;
public circle(float r){
radius=r;
}
public void  getArea(){
System.out.println(3.14*radius*radius);
}
public void getPerimeter(){
System.out.println((int)(2*3.14*radius));
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++){
System.out.println("radius is");
float r=sc.nextFloat();
circle c1=new circle(r);
System.out.println("Area and perimeter of c"+i+ "is");
c1.getArea();
c1.getPerimeter();
}
}
}
