// class keyword is required to create a class
class Car {

	/*
		A class is a blueprint of an object, an object which is the building block of Java
		[ Object-Oriented Programming ] is a single entity that has some attributes and methods.

		An attribute : is a property that can be defined and belongs to all the objects of that class.
		A method : is an action or task that is supposed to be performed by or on the object.

		A general example would be a class called Car.
	*/

	// the attributes defined in a class are called fields.

	// these are instance fields, each object of this class will have their own copy. Like each car has its own chassis number etc.
	int chassisNumber;
	String licensePlateNumber;
	int acceleration;

	// these are static fields, each object of this class will have access to only this copy. Like number of Tyres, common for all cars.
	static int numberOfTyres = 4;

	// instance but final, each object will have their own copy, but they can not modify it. For example, all cars which are made in India
	// will have country of Origin as India, and it should not be modified.
	final String countryOfOrigin = "INDIA";

	// methods of a class.

	// instance method, has access to instance variables of the calling function.
	public void accelerate() {
		System.out.println("increasing acceleration : " + acceleration + "->" + (acceleration+1));
		acceleration += 1;
	}

	// static method, does not have access to instance variables of the calling function.
	public static void moveForward(int acceleration) {
		System.out.println("Moving forward with " + acceleration + " m/s^2 acceleration.");
	}

	Car(int chassisNumber, String licensePlateNumber) {
		this.chassisNumber = chassisNumber;
		this.licensePlateNumber = licensePlateNumber;
		this.acceleration = 1; // 1 m/s2
	}


	// main method
	public static void main (String[] args) {
		// Creating an object of Car class.
		// We always create an object using the new keyword, it allocates required space in memory to create the object.
		Car newCar = new Car(1234, "MH A0 11 1965");

		// accessing instance fields
		System.out.println("chassis number is : " + newCar.chassisNumber);
		System.out.println("License Number is : " + newCar.licensePlateNumber);

		// accessing static fields
		System.out.println("Number of tyres : " + numberOfTyres);

		// accessing instance methods
		newCar.accelerate();
		newCar.accelerate();

		// accessing static method
		moveForward(newCar.acceleration);
	}
}
