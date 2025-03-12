public class Computer {
private String model ;
public Computer(String model){
this.model = model;
}
public class Processor {
private int cores ;
public processor(int cores){
this.cores = cores ;
}
public void display(){
System.out.println("computer model:" + model );
System.out.println("computer core:" + cores );
}
}
public void  displaydetails(){
class Localinner {
private String details;
public Localinner(String details){
this.details = details;
}
public void display(){
System.out.println("local class:" + details );
}
}
Localinner l = new Localinner("this is local class");
l.display();
}
}
public class Main{
public static void main(String[]args){
Computer c = new Computer("Mac");
computer


