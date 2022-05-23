package question2;

import java.util.Arrays;

public class Light extends Car{//inherits from Car class
	public static int[] removeCar(int[] arr) {
		//creates a new copy of the queue but reduces the length by one to accommodate the removal of the first car in the collection(during yellow and green light)

		int[] varQueue =Arrays.copyOf(arr,arr.length-1);
		for(int i=0;i<varQueue.length;i++) {//copies all cars in the queue except the first one
			varQueue[i]=arr[i+1];
		}
		return varQueue;
		
	}
}

