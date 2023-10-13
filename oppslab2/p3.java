import java.util.*;
class lamp{
public void turnon(){
System.out.println("It is glowing");
}
public void turnoff(){
System.out.println("It is not glowing");
}
public lamp(String s){
if(s.equals("On")){
turnon();
}
else if(s.equals("Off")){
turnoff();
}
}
}
public class p3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(true){
String s=sc.next();
if(s.equals("exit")){
break;
}
else{
lamp l=new lamp(s);
}
}
}
}
