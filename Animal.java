
/**
 * this class provides most of the data needed to create an object of the subclasses
 * @author Mark Burnette
 *
 */
public abstract class Animal{

	private double age; //in years
	private double height; //in meters
	private double weight; //in kilograms
	private String soundToMake;
	
	/**
	 * this constructor sets the values of the fields to default values
	 */
	public Animal() {
		age = 0.0;
		height = 0.0;
		weight = 0.0;
		soundToMake = null;
	}
	
	/**
	 * this constructor sets values of the fields to the arguments passed to this method
	 * @param age
	 * @param height
	 * @param weight
	 * @param soundToMake
	 */
	public Animal(double age, double height, double weight, String soundToMake) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.soundToMake = soundToMake;
	}

	/**
	 * this abstract method provides a base to implement this method by subclasses of Animal
	 */
	public abstract void speak();

	/**
	 * this method gets the value of age
	 * @return
	 */
	public double getAge() {
		return age;
	}

	/**
	 * this method sets the value of age to the argument
	 * @param age
	 */
	public void setAge(double age) {
		this.age = age;
	}

	/**
	 * this method gets the value of height
	 * @return
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * this method sets the value of height to the argument
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * this method gets the value of weight
	 * @return
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * this method sets the value of weight to the argument
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * this method gets the value of soundToMake
	 * @return
	 */
	public String getSoundToMake() {
		return soundToMake;
	}

	/**
	 * this method sets the value of soundToMake to the argument
	 * @param soundToMake
	 */
	public void setSoundToMake(String soundToMake) {
		this.soundToMake = soundToMake;
	}
}