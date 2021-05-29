package threadBehaviour1;

public class Hi implements Runnable{

	
	
	
	
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");		
			
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	

}
