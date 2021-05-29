package threadBehaviour1;

public class Hello implements Runnable{


	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}	
	}
}
