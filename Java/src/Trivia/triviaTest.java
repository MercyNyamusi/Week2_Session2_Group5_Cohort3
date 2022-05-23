package question1;

import static org.junit.Assert.*;

import org.junit.Test;


public class triviaTest {
@Test
public void checkerTest() {
	String[] question = {"How many planets are in our solar system?","Which ocean is off the California coast?","Which Disney movie is Elsa in?","What is the capital city of South Africa?","How many pairs of wings do bees have?","Where is the Great Pyramid of Giza?","Which is the tallest building in the world?","Who is the current president of Ukraine?"," “Stars and Stripes” is the nickname of the flag of which country?","Who was the first man to step on the moon?"};
	
	//nested array containing the five choices
	String[][] choices = {{"Nine","Ten","Eight","Eleven","I don't know"},{"Atlantic","Indian Ocean","The Southern Ocean","The Pacific","I don't know"},{"Frozen","Spiderman","Beauty and the Beast","Peter Pan","I don't know"},{"Pretoria","Bloemfontein","Johannesburg","Cape Town","I don't know"},{"Six","Three","One","Two","I don't know"},{"Cameroon","Egypt","Israel","Lebanon","I don't know"},{"Merdeka 118","Shanghai Tower","Eiffel Tower","Burj Khalifa","I don't know"},{"Volodymyr Zelenskyy","János Áder","Andrzej Duda","Vladimir Putin","I don't know"},{"Liberia","Malaysia","Cuba","United States of America","I don't know"},{"Sally Ride","Neil Armstrong","Laika the Space Dog","Buzz Aldrin","I don't know"}};
	//array containing the correct answers to the trivia questions
	int[] answers = {3,4,1,2,4,2,4,1,4,2};
	Trivia test=new Trivia(question,choices,answers);
	assertEquals(test.checker(1, 3, 2), -1);//test when answer is incorrect
	assertEquals(test.checker(1, 1, 2), 1);//test when answer is correct
	assertEquals(test.checker(1, 5, 2), 0);//test when answer is "I don't know"
	assertEquals(test.checker(1, 8, 2), -2);//test when answer is invalid
	
}
}
