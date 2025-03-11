class Battery {
int capacity;
Battery(int capa){
	this.capacity=capa;
}
void display() {
	System.out.println("Battery  and capacity");
}
}
class Mobile{
	Battery b ;
	Mobile(int batry){
		b = new Battery(batry);
	}
	void display() {
		System.out.println("information in moblie");
		b.display();
	}
}
	public class Main1{
		public static void main(String args[]) {
			Mobile m = new Mobile(500);
			m.display();
			
		}
	}
	
