import java.util.*;
class person{
String name;
String address;
public person(String n,String a){
this.name=n;
this.address=a;
}
public String getName(){
return this.name;
}
public String getaddress(){
return this.address;
}
public String toString(){
return this.name+this.address;
}
}
class student extends person{
int numcourses=0;
HashMap<String,Integer> map=new HashMap<>();
public student(String n,String a){
super(n,a);
}
public void addCourse(String c,int g){
if(numcourses==2){
System.out.println("you already reached the Courselimit");
}
else if(map.get(c)==null){
map.put(c,g);
numcourses++;
}
else{
System.out.println("you already took that course");
}
}
double avg=0;
public void printGrades(){
System.out.println("your grades are:");
Set<String> s=map.keySet();
for(String k:s){
System.out.println(map.get(k));
avg=avg+map.get(k);
}
}
public void getAvergegrade(){
System.out.println("Average ");
System.out.println(avg/numcourses);
}
}
class Teacher1 extends person{
int numCourses=0;
ArrayList<String> a=new ArrayList<>();
public Teacher1(String n,String a){
super(n,a);
}
public void addCourse(String c){
if(numCourses==2){
System.out.println("you reached your limit");
}
else{
a.add(c);
numCourses++;
}
}
public void removeCourse(String c){
if(a.contains(c)==false){
System.out.println("course not exists");
}
else{
a.remove(c);
}
}
public void getCourses(){
System.out.println("Courses");
for(String s:a){
System.out.println(s);
}
}
}
class Teacher{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
student s=new student("Mona","Warangal");
int x=0;
while(x!=-1){
x=sc.nextInt();
switch(x){
case 1:
System.out.println("addCourse");
System.out.println("name");
String co=sc.next();
System.out.println("grade");
int y=sc.nextInt();
s.addCourse(co,y);
break;
case 2:
s.printGrades();
break;
case 3:
s.getAvergegrade();
break;
}
}
x=0;
Teacher1 t=new Teacher1("R.K","Warangal");
while(x!=-1){
x=sc.nextInt();
switch(x){
case 1:
System.out.println("addCourse");
System.out.println("name");
String co=sc.next();
t.addCourse(co);
break;
case 2:
String c=sc.next();
t.removeCourse(c);
break;
case 3:
t.getCourses();
break;
}
}
}
}

