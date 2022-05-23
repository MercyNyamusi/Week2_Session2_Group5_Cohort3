package question1;

import java.util.Scanner;

public class Trivia {
		private String[] questions;
		private String[][] choices;
		private int[] answers;
		
		
		public Trivia(String[] quest,String[][] mcq,int[] ans){
			this.questions=quest;
			this.choices=mcq;
			this.answers=ans;
		}
		
		public void run(){
			int result =triviaGame();	
			if(result==0) {
				int interest= repeat();
				if(interest==0) {
					run();
					}				
				}		
			}
		
		public int checker(int correctAns, int userAns,int num) {//checks if user input matches correct answer
			if(userAns == correctAns) {
				System.out.println("Correct!");
				return 1;
			}
			else if(userAns==5) {//score remains same if user answer "I don't know"
				System.out.printf("The right answer is %s",this.choices[num][correctAns-1]);//displays correct answer
				System.out.println();
				return 0;
			}
			else if(userAns>5) {
				System.out.println("Invalid input please try again");
				return -2;
				
			}
			else {
				System.out.printf("Incorrect.\nThe right answer is %s",this.choices[num][correctAns-1]);//displays correct answer
				System.out.println();
				return -1;
			}
				
		}
		
		public int triviaGame(){
			int count =0;//variable to store the score 
			Scanner userInput = new Scanner(System.in);
			for(int i = 0; i<this.questions.length;i++){
			
				System.out.println(i+1+". "+this.questions[i]+":");//displays question
				System.out.println();
				for(int j=0;j<choices[j].length;j++) //displays the choices
					System.out.println(j+1 +". "+choices[i][j]);			
				
				
				long startTime = System.currentTimeMillis(); //time the question is displayed
				
				int ans = userInput.nextInt();
				
				long endTime = System.currentTimeMillis();  //time answer is submitted
				int status = checker(answers[i],ans,i);
				
				if(status == 1){//increases score by one if answer is correct
					count +=1;
				}
				else if(status == -1 && count>0){//decreases score by one if answer is incorrect
					count-=1;
				}
				else if(status == -2){
					return 0;
				}
				
				
				System.out.printf("Time taken: " + (endTime-startTime)/1000 +" second(s)");//displays time taken to answer question
				System.out.println();
				
				if(i<9) {
					int interest=repeat();//asks user whether they wish to continue playing or not
					if(interest==0) {
						continue;
					}
					else if(interest==1) {
						return 1;
					}	
					else if(interest==-1) {
						return 0;
					}
				}
				else {
					System.out.printf("Your score is: %d",count);//displays total score
					System.out.println();
					System.out.println("Thank you for playing.");
					return 0;
					
				}
			}
			return -1;
			
		}
		
		
		public int repeat() {//asks user whether they wish to continue playing or not
			
				Scanner userInput = new Scanner(System.in);
				System.out.println("Do you wish to continue playing?(Please select 1 or 2)\n1. Yes\n2. No");
				int ans1 = userInput.nextInt();
				if(ans1==1) {
					return 0;
				}
				else if (ans1==2){
					System.out.println("Thank you for playing. See you!!!");
					return 1;
				}
				else {
					System.out.println("Invalid input please try again");
					return -1;
				}
		 }
}