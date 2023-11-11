/**
 * this class extends Canidae and provides more data to create an object of this class
 * @author Mark Burnette
 *
 */
public class Wolf extends Canidae{

	private String fullName;
	private String wolfQuote;
	private String typeOfWolf;
	
	/**
	 * this constructor sets the values of the fields to default values and calls the parent class constructor
	 */
	public Wolf() {
		super();
		setFullName(null);
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
	 * @param fullName
	 */
	public Wolf(double age, double height, double weight, 
			String soundToMake, String canineSound, String typeOfCanine, String fullName) {
		super(age, height, weight, soundToMake, canineSound, typeOfCanine);
		this.fullName = fullName;
	}

	/**
	 * this method overrides the speak method of the Canidae class
	 */
	public void speak() {
		System.out.print(wolfQuote);
	}

	/**
	 * this method gets the value of fullName
	 * @return
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * this method sets the value of fullName to the argument
	 * @param fullName
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * this method gets the value of wolfQuote
	 * @return
	 */
	public String getWolfQuote() {
		return wolfQuote;
	}

	/**
	 * this method sets the value of wolfQuote to the argument
	 * @param wolfQuote
	 */
	public void setWolfQuote(String wolfQuote) {
		this.wolfQuote = wolfQuote;
	}

	/**
	 * this method gets the value of typeOfWolf
	 * @return
	 */
	public String getTypeOfWolf() {
		return typeOfWolf;
	}

	/**
	 * this method sets the value of typeOfWolf to the argument
	 * @param typeOfWolf
	 */
	public void setTypeOfWolf(String typeOfWolf) {
		this.typeOfWolf = typeOfWolf;
	}

}
