/*
 * Mark Burnette
 */

import java.util.ArrayList;

/**
 * 
 * @author Mark Burnette
 *
 */
public class AnimalList {

	/**
	 * this main method makes 1 object for each subclass of the Animal class and one object for the subclass
	 * wolf of the Canidae class
	 * @param args
	 */
	public static void main(String[] args) {
		Canidae canine = new Canidae(5.0, 0.508, 17.2, "", "wow-wow-wow", "fox"); //Fox (general)
		Felidae feline = new Felidae(14.0, 1.189, 190.509, "", "roooaar", "lion"); //Lion (general)
		Wolf wolf = new Wolf(27.0, 0.823, 81.647, "gggrrrrr","", "graw wolf", "Wolf O'Donell"); //Gray Wolf
		
		wolf.setWolfQuote("You're good, but I'm better!");
		
		ArrayList<Animal> animalList= new ArrayList<Animal>();
		animalList.add(canine);
		animalList.add(feline);
		animalList.add(wolf);
		
		for(Animal speak: animalList) {
			speak.speak();
		}
		
	}

}
