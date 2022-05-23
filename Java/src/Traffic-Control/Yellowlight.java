package question2;


public class Yellowlight extends Light{
	public int[] yellowLight(Car carObj) {			
			try {
				int length = 5; // loop runs 5 times to achieve 10 seconds since each loop sleeps for 2 seconds
				if (carObj.carQueue.length<5) {
					length=carObj.carQueue.length;
				}
				for(int i =0;i<length;i++) {
					long startTime = System.currentTimeMillis();
					//program sleeps for 2000milliseconds(2 seconds) 
					Thread.sleep(2*1000);
					long endTime = System.currentTimeMillis();
					//measures the time interval during which the program sleeps
					System.out.printf("Time passed: " + (endTime-startTime)/1000 +" second(s)");
					carObj.carQueue=removeCar(carObj.carQueue);//removes one car during each loop which takes 2 seconds
					System.out.println("Yellow Light. Queue Length: "+ carObj.carQueue.length);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return carObj.carQueue;
			
		}

	
	
}

