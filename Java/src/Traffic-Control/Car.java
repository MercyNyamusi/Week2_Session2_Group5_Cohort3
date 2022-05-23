package question2;

import java.util.Random;
import java.util.Arrays;

public class Car extends Thread{
	public int[] carQueue= {};
	public void setQueue(int[] arr) {
		this.carQueue=arr;
	}
	@Override
	//overrides the run method of Thread Class
	public void run() {		
		while(carQueue.length<100 && carQueue.length>0) {
			//random integer between 0-9 is generated
			Random rand = new Random();
			int timeInterval = rand.nextInt(10);
			
			try {		
				long startTime = System.currentTimeMillis(); 
				//program sleeps for the random milliseconds generated in line 15
				Thread.sleep(timeInterval*1000);
				long endTime = System.currentTimeMillis(); 
				//measures the time interval during which the program sleeps
				System.out.printf("Time passed: " + (endTime-startTime)/1000 +" second(s)");
				
				if(carQueue.length!=0) {	
					//a car is added to the collection only if the collection is not empty
					this.carQueue = addCar(this.carQueue);
					System.out.println("One Car Added. Queue Length:"+ carQueue.length);
				}
				else { 
					//program is terminated when all the cars in the collection are gone
					System.out.println("No car added");
					return;
				}			
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
	public int[] addCar(int[] arr) {
		//creates a new copy of the queue but with an extra length of one to accommodate the new value in case no cars are removed from collection(during red light)
		int[] varQueue =Arrays.copyOf(arr,arr.length+1);
		varQueue[arr.length]=arr.length+1;//new car is added to the collection
		return varQueue;
		
	}
	
}
	


	
