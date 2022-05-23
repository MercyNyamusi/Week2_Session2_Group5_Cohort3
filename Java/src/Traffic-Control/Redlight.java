package question2;

public class Redlight extends Light{
	public int[] redLight(Car carObj) {
		try {
			long startTime = System.currentTimeMillis();
			//program sleeps for 20,000 milliseconds(20 seconds)
			Thread.sleep(20*1000);
			long endTime = System.currentTimeMillis(); 
			//measures the time interval during which the program sleeps
			System.out.printf("Time passed: " + (endTime-startTime)/1000 +" second(s)");
			System.out.println("Red Light. Queue Length: "+ carObj.carQueue.length);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return carObj.carQueue;
		
	}
}

