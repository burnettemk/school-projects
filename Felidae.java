/**
 * this class extends the class Animal and provides more data for creating an object of this class
 * @author Mark Burnette
 *
 */
public class Felidae extends Animal{

	private String typeOfFeline;
	private String felineSound;
	
	/**
	 * this constructor sets the values of the fields to default values and calls the parent class constructor
	 */
	public Felidae() {
		super();
		typeOfFeline = null;
		felineSound = null;
	}
	
	/**
	 * this constructor sets values of the fields to the arguments passed to this method
	 *  and calls the parent class constructor
	 * @param age
	 * @param height
	 * @param weight
	 * @param soundToMake
	 * @param felineSound
	 * @param typeOfCanine
	 */
	public Felidae(double age, double height, double weight, String soundToMake, String felineSound, String typeOfFeline) {
		super(age, height, weight, soundToMake);
		this.typeOfFeline = typeOfFeline;
		this.felineSound = felineSound;
	}
	
	/**
	 * this method implements the abstract speak method of the Animal class
	 */
	public void speak() {
		System.out.println(felineSound);
	}

	/**
	 * this method gets the value of typeOfFeline
	 * @return
	 */
	public String getTypeOfDog() {
		return typeOfFeline;
	}

	/**
	 * this method sets the value of typeOfCanine to the argument
	 * @param typeOfFeline
	 */
	public void setTypeOfDog(String typeOfFeline) {
		this.typeOfFeline = typeOfFeline;
	}

	/**
	 * this method overrides the method getSoundToMake in the Animal class 
	 * and instead gets the value of felineSound
	 */
	public String getSoundToMake() {
		return felineSound;
	}

	/**
	 * this method overrides the method getSoundToMake in the Animal class 
	 * and instead sets the value of felineSound to the argument
	 */
	public void setSoundToMake(String felineSound) {
		this.felineSound = felineSound;
	}
	
}
