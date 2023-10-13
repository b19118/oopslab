import java.util.*;
class car{
String company;
double mileage;
double speed;
String color;
public car(String c,double m,double s,String co){
company=c;
mileage=m;
speed=s;
color=co;
}
}
public class p4{
public static String check(double distance,car c[]){
double min=11111111;
String ch="";
for(int i=0;i<c.length;i++){
double m=c[i].mileage;
double x=(distance/m);
if(x<min){
min=x;
ch=c[i].company;
}
}
return ch;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
car c[]=new car[3];
String company="";
double mileage=0;
double speed=0;
String color="";
for(int i=0;i<c.length;i++){
System.out.println("Enter Company");
company=sc.next();
System.out.println("Enter mileage");
mileage=sc.nextDouble();
System.out.println("Enter speed");
speed=sc.nextDouble();
System.out.println("Enter color");
color=sc.next();
c[i]=new car(company,mileage,speed,color);
}
double distance=0;
for(int i=0;i<1;i++){
System.out.println("Enter the distance of location");
distance=sc.nextDouble();
String cp=check(distance,c);
System.out.println("you can choose "+cp);
}
}
}


