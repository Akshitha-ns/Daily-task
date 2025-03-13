public class Computer {
private String model ;
public Computer(String model){
this.model = model;
}
public class Processor {
private int cores ;
public Processor(int cores){
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
public class Main1 {
public static void main(String[] args) {
Computer c = new Computer("Mac");
Computer.Processor p = c.new Processor(8);
p.display();
c.displayDetails();
Runnable a = new Runnable() {
@Override
public void run() {
System.out.println("Anonymous Inner Class is running");
}
};
a.run();
}
}}


