package WiproAssignment3;
	class mammals{
		void eat() {
			System.out.println("Eat");
		}
		void sleep(){
			
			System.out.println("Sleep");
		}
	}
	class Bird extends mammals{
		void fly(){
			System.out.println("Fly");
		}
	}
public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
