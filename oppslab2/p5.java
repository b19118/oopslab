import java.util.*;
class Dog{
   String name;
   String breed;
   String color;
   double height;
   String type;
   public Dog(String n,String b,String c,double h,String t){
   name=n;
   breed=b;
   color=c;
   height=h;
   type=t;
   }
}
public class p5{
public static String check(String br,String c,Dog d[]){
String m="we cant found your dog";
for(int i=0;i<d.length;i++){
if(d[i].breed.equals(br) && d[i].color.equals(c)){
m="you can choose "+d[i].name;
}
}
return m;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Dog d[]=new Dog[3];
/*for(int i=0;i<d.length;i++){
d[i]=new Dog();
   System.out.println("Enter name of dog");
   d[i].name=sc.next();
    System.out.println("Enter breed");
    d[i].breed=sc.next();
     System.out.println("Enter color");
    d[i].color=sc.next();
     System.out.println("Enter height");
    d[i].height=sc.nextDouble();
     System.out.println("Enter type");
    d[i].type=sc.next(); 
}*/
d[0]=new Dog("snoopy","pomerian","white",1,"gurad");
d[1]=new Dog("rocky","lab","brown",3,"sniffer");
d[2]=new Dog("snowy","shepherd","black",4,"shepherd");

   for(int i=0;i<1;i++){
   System.out.println("your fav breed");
   String b=sc.next();
    System.out.println("your fav color");
   String c=sc.next();
   String n=check(b,c,d);
   System.out.println(n);
   }
   
}
}
