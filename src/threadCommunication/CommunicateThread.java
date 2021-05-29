package threadCommunication;


//class Value 
class Value{
	
	int k;
	boolean valueSet = false;
	public synchronized void addValues(int k) throws InterruptedException {
	
		this.k = k;
		while(valueSet == false) {
			wait();
			valueSet = true;
			
		}
		
		
		
		
		System.out.println("Produced value -- " + this.k);
		
		notify();
	}
	
	public synchronized int getValue() throws InterruptedException {
		
		while(valueSet == true) {
			wait();
			valueSet = false;
		}
		
		
		notify();
		
		return k;
	}
	
	
}


// producer class
class Producer implements Runnable {
	
	//create a reference of value class 
	Value value;
	
	
	public Producer(Value value){
		this.value = value;
		Thread t1 = new Thread(this,"Producer");
		t1.start();
	}
	
	public void run() {

		int i = 0;
		while(true) {
			i++;
			//add value method
			try {
				value.addValues(i);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			
			
			try {
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}



//class consumer
class Consumer implements Runnable{
	
	Value value;
	
	public Consumer(Value value) {
		this.value = value;
		Thread t2 = new Thread(this,"Consumer");
		t2.start();
	}
	
	
	public void run() {
		while(true) {
			
			try {
				int a = value.getValue();
				System.out.println("Consumed Value -- " + a);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}



public class CommunicateThread {

	public static void main(String[] args) {
			
		Value objValue = new Value();
		new Producer(objValue);
		new Consumer(objValue);
		
		

	}

}
