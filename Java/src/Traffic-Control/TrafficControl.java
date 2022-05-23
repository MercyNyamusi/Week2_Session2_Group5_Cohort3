package question2;


public class TrafficControl implements Runnable{
	public Car carObj;
	
	TrafficControl(Car carObj){
		this.carObj = carObj;
	}
	@Override
	public void run(){
		startFlow();
	}
	
	public void startFlow(){
		//creates instances of yellow,green and red light
		Yellowlight y1=new Yellowlight();//creates an instance of Yellow class
		Greenlight g1=new Greenlight(); //creates an instance of Green class
		Redlight r1=new Redlight();	//creates an instance of Red class
		
		while(carObj.carQueue.length>0){//only controls the traffic lights when there are cars in the queue
			
			carObj.carQueue = r1.redLight(carObj);//turns on the red traffic light
			carObj.carQueue = y1.yellowLight(carObj);//turns on the yellow traffic light
			carObj.carQueue = g1.greenLight(carObj);//turns on the green traffic light
		}	
		//prints at the end of the program
		System.out.println("Current Queue Length:"+ carObj.carQueue.length +"\n"+"Queue empty. Traffic Control over!!");
		return;
		}
}

	

