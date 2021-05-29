package threadBehaviour1;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Hi objHi = new Hi();
		Hello objHello = new Hello();
		
		Thread t1 = new Thread(objHi);
		Thread t2 = new Thread(objHello);
		
		/// if we use this we have to remove sleep method to get the advantages of this method 
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		
		
		//IsAlive is used to check whether the Thread is existing or not
		System.out.println("Thread 1 Is Alive - " + t1.isAlive());
		System.out.println("Thread 2 Is Alive - " + t2.isAlive());
		
		//join our created thread to the main thread
		t1.join();
		t2.join();
		
		
		//this is run first because it is in main thread (until we provide priority - we have to join)
		System.out.println("Bye");
		
				

	}

}
