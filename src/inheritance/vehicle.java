package inheritance;

class Vehicle {
	protected String brand = "VW";
	protected boolean roadLegal = true;

	public void honk() {
		System.out.println("beep, beep");
	}
}

class Car extends Vehicle {
	private String modelName = "Golf";

	public static void main(String[] args) {

		Car myCar = new Car();
		System.out.println("arguably the best car ever made is" + myCar.brand + " " + myCar.modelName);
	}
}

class Motorbike extends Vehicle {
	private String modelName = "Harley Davidson";

	public static void main(String[] args) {

		Motorbike myBike = new Motorbike();
		System.out.println(
				if( myBike.roadLegal) {
			return "Harley Davidson is a type of motorbike that is road legal"
		});
	}

}