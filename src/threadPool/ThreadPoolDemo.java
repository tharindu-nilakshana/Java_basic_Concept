package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		
		//create 5 active thread to use 
		ExecutorService excecutor = Executors.newFixedThreadPool(4);
		
		for(int i=0;i<1000;i++) {
			//create the task that we want to run
			Runnable task = new Task(""+i);
			//execute the task using thread
			excecutor.execute(task);
		}
		
		excecutor.shutdown();

	}

}
