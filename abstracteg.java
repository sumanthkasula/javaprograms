 abstract class animal{// abstract class can have abstract methods and concrete methods
	public abstract   void sound();//abstract method
	public void cre() {
		//non abstract method or concrete class
	}
}
class dog extends animal{
	public void sound(){
		System.out.println("the sound of dog is woof");
	}
}
public class abstracteg {
	public static void main(String[] args) {
		animal a =new dog();
		a.sound();
	}

}
