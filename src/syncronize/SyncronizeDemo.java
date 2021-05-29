package syncronize;

public class SyncronizeDemo implements Runnable{
	
	static int count = 0;

	public static void main(String[] args) throws InterruptedException {
		
		
		
		SyncronizeDemo obj1 = new SyncronizeDemo();
		SyncronizeDemo obj2 = new SyncronizeDemo();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		/*
		 * when we use like this we can get some value less than 4000 because the both two thread sometime
		 * access the same count value to overcome from this issue we can use syncronize
		 * 
		 * */
		
		t1.join();
		t2.join();
		
		System.out.println(count);
		
	}
	
	

	// we can use synchronized here
	public synchronized void increament() {
		count++;
	}




	public void run() {
		
		for(int i =0; i<2000;i++) {
			
			increament();
		}
		
	}
}
