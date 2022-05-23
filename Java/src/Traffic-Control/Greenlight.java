package question2;


public class Greenlight extends Light{
	public int[] greenLight(Car carObj) {
		try {
			int length = 30;// loop runs 30 times to achieve 30 seconds since each loop sleeps for 1 seconds
			if (carObj.carQueue.length<30) {
				length=carObj.carQueue.length;
			}
			for(int i =0;i<length;i++) {
				long startTime = System.currentTimeMillis(); 
				//program sleeps for 1000milliseconds(1 second)
				Thread.sleep(1*1000);
				long endTime = System.currentTimeMillis(); 
				//measures the time interval during which the program sleeps
				System.out.printf("Time passed: " + (endTime-startTime)/1000 +" second(s)");
				carObj.carQueue=removeCar(carObj.carQueue);//removes one car during each loop which takes 1 second
				System.out.println("Green Light. Queue Length: "+ carObj.carQueue.length);
			}
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return carObj.carQueue;		
	}
	
}




