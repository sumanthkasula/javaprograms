package multithreading_programs;

public class thread_Example implements Runnable{
	    @Override
	    public void run() {
	    }
	    public static void main(String[] args) {
	        Thread t1 = new Thread();
	       
	        t1.start();
	        try {
	            t1.sleep(1000);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        t1.setPriority(1);
	        int priority1  = t1.getPriority();
	        System.out.println(priority1);
	        System.out.println("Thread Running");
	       
	  }
	}
