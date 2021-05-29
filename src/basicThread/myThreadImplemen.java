package basicThread;

public class myThreadImplemen implements Runnable {
	
	int[] val = {2,4,6,8,10};
	

	public static void main(String[] args) {
		myThreadImplemen obj1 = new myThreadImplemen();
		myThreadImplemen obj2 = new myThreadImplemen();
		
		Thread t1 = new Thread(obj1);
		t1.start();
		
		Thread t2 = new Thread(obj2);
		t2.start();
		
		

	}

	
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			int a = val[i]*3;
			System.out.println("Id is "+Thread.currentThread().getId()+"   "+a);
			
		}
		
	}
	
	
	

}
