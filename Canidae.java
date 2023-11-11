/**
 * this class extends the class Animal and provides more data for creating an object of this class
 * @author Mark Burnette
 *
 */
public class Canidae extends Animal{

	private String typeOfCanine;
	private String canineSound;
	
	/**
	 * this constructor sets the values of the fields to default values and calls the parent class constructor
	 */
	public Canidae() {
		super();
		typeOfCanine = null;
	}
	
	/**
	 * this constructor sets values of the fields to the arguments passed to this method
	 *  and calls the parent class constructor
	 * @param age
	 * @param height
	 * @param weight
	 * @param soundToMake
	 * @param canineSound
	 * @param typeOfCanine
	 */
	public Canidae(double age, double height, double weight, String soundToMake, String canineSound, String typeOfCanine) {
		super(age, height, weight, soundToMake);
		this.typeOfCanine = typeOfCanine;
		this.canineSound = canineSound;
	}
	
	/**
	 * this method implements the abstract speak method of the Animal class
	 */
	public void speak() {
		System.out.println(canineSound);
	}

	/**
	 * this method gets the value of typeOfCanine
	 * @return
	 */
	public String getTypeOfCanine() {
		return typeOfCanine;
	}

	/**
	 * this method sets the value of typeOfCanine to the argument
	 * @param typeOfCanine
	 */
	public void setTypeOfDog(String typeOfCanine) {
		this.typeOfCanine = typeOfCanine;
	}

	/**
	 * this method overrides the method getSoundToMake in the Animal class 
	 * and instead gets the value of canineSound
	 */
	public String getSoundToMake() {
		return canineSound;
	}

	/**
	 * this method overrides the method setSoundToMake in the Animal class 
	 * and instead sets the value of canineSound to the argument
	 */
	public void setSoundToMake(String canineSound) {
		this.canineSound = canineSound;
	}
}
