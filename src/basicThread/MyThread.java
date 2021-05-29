package basicThread;

public class MyThread extends Thread{
	
	
	int[] val = {2,4,6,8,10};
	

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();
		myThread1.setName("Thread 1");
		myThread1.start();
		
		
		//second thread
		MyThread myThread2 = new MyThread();
		myThread2.setName("Thread 2");
		myThread2.start();
		
		
		
	}

	
	//basically when we are write thread there is a method call run
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			int a = val[i]*3;
			System.out.println("Id is "+Thread.currentThread().getId()+"   "+a);
			
		}
	}
	
	
//	public void addValues() {
//		
//		for(int i=0;i<5;i++) {
//			int a = val[i]*3;
//			System.out.println(a);
//			
//		}
//	}
}
