import java.util.*;
class TV{
int channel;
int volume;
boolean on;
public void turnOn(){
   on=true;
   System.out.println("Tv is On");
}
public void turnOff(){
on=false;
System.out.println("Tv is off");
}
public void setChannel(int i){
channel=i;
}
public void setVolume(int v){
volume=v;
}
public void channelUp(){
if(channel>40){
System.out.println("We only had 40 channels");
}
else{
channel++;
}
}
public void channelDown(){
if(channel<1){
System.out.println("Invalid Channel");
}
else{
channel--;
}
}
public void volumeUp(){
if(volume>7){
System.out.println("Excess volume");
}
else{
volume++;
}
}
public void volumeDown(){
   if(volume<0){
System.out.println("Already in mute");
}
else{
volume--;
}
}
}
public class p2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
TV t=new TV();
int i=0;
while(true){
i=sc.nextInt();
if(i==2){
t.turnOff();
break;
}
else{
switch(i){
case 1:
t.turnOn();
break;
case 2:
t.turnOff();
break;
case 3:
System.out.println("Enter your channel no:");
int c=sc.nextInt();
t.setChannel(c);
break;
case 4:
System.out.println("Enter volume");
int v=sc.nextInt();
t.setVolume(v);
break;
case 5:
t.channelUp();
break;
case 6:
t.channelDown();
break;
case 7:
t.volumeUp();
break;
case 8:
t.volumeDown();
break;
}
}
}
System.out.println("channel no is"+t.channel);
System.out.println("volume is"+t.volume);
}
}

