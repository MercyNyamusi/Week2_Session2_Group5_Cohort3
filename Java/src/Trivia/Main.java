package question1;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		//prints welcome message	
		//array containing trivia questions
		String[] question = {"How many planets are in our solar system?","Which ocean is off the California coast?","Which Disney movie is Elsa in?","What is the capital city of South Africa?","How many pairs of wings do bees have?","Where is the Great Pyramid of Giza?","Which is the tallest building in the world?","Who is the current president of Ukraine?"," “Stars and Stripes” is the nickname of the flag of which country?","Who was the first man to step on the moon?"};
		
		//nested array containing the five choices
		String[][] choices = {{"Nine","Ten","Eight","Eleven","I don't know"},{"Atlantic","Indian Ocean","The Southern Ocean","The Pacific","I don't know"},{"Frozen","Spiderman","Beauty and the Beast","Peter Pan","I don't know"},{"Pretoria","Bloemfontein","Johannesburg","Cape Town","I don't know"},{"Six","Three","One","Two","I don't know"},{"Cameroon","Egypt","Israel","Lebanon","I don't know"},{"Merdeka 118","Shanghai Tower","Eiffel Tower","Burj Khalifa","I don't know"},{"Volodymyr Zelenskyy","János Áder","Andrzej Duda","Vladimir Putin","I don't know"},{"Liberia","Malaysia","Cuba","United States of America","I don't know"},{"Sally Ride","Neil Armstrong","Laika the Space Dog","Buzz Aldrin","I don't know"}};
		//array containing the correct answers to the trivia questions
		int[] answers = {3,4,1,2,4,2,4,1,4,2};
		Trivia game = new Trivia(question,choices,answers);
		
		
		System.out.println("Welcome to the AnswerIt Trivia!!\nThe game has 10 questions. Each question will have 5 choices only one of which is correct.\nEach correct answer is worth 1 point, a wrong answer is worth -1 points and an 'I don't know' answer is worth 0 points.\nTo CHOOSE AN ANSWER please ENTER 1,2,3,4,or5. Your score will be displayed at the end of the game.\nEnjoy!!!!");
		game.run();
	}
	

}