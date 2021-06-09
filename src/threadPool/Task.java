package threadPool;

public class Task implements Runnable{

	
	String message ;
	public Task(String s) {
    
		this.message = s;
      
	}
	
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" Start - "+message);
		processMessage();
		System.out.println(Thread.currentThread().getName()+"End-- ");
		
		
	}
	
	
	private void processMessage(){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
