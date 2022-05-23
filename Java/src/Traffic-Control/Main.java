package question2;


public class Main {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};

//		creates an instance of Car with an initial queue of 40 cars
		Car newQueue = new Car();	
		newQueue.setQueue(arr);
		
//      creates an instance of traffic lights
		TrafficControl t1 = new TrafficControl(newQueue);//take Car Object as argument both threads are modifying the same Car object queue
		Thread thread = new Thread(t1);
		
		//two threads to run concurrently
		newQueue.start();		//thread to add cars to collection
		thread.start();        //thread to control the traffic lights
	}	
}
	

		
