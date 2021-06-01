package multithreading_programs;
class addition implements Runnable{
	@Override
	public void run() {
		int a=5;
		int b=5;
		int i=1;
		while(i!=200) 
		{
			int c=a+b;
			System.out.println("the sum of two numbers is : "+c);
			i++;
			try{Thread.sleep(200);}
			catch(InterruptedException e){System.out.println(e);}
		}		
	}	
}
class multiplication implements Runnable{
	@Override
	public void run() {
		int a=5;
		int b=5;
		int i=1;
		while(i!=200) {
			int c=a*b;
			System.out.println("the product of two numbers is : "+c);
			i++;
			try{Thread.sleep(100);}
			catch(InterruptedException e){System.out.println(e);}
		}		
	}	
}
public class arthemetic_with_thread {
	public static void main(String[] args) {
		addition a = new addition();
		multiplication m = new multiplication();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(m);
		t1.start();
		t2.start();
	}
}
