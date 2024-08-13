package shobna;
class Vehicles {
	void noOfVehicles() {
		System.out.println("Hundred");
	}
}
class ThreeWheeler extends Vehicles{
	void noOfWheels() {
		System.out.println("Two wheels");
	}
}
class Bike extends ThreeWheeler {
	void brandName() {
		System.out.println("Four wheels");
	}
}
public class Vehicle {
	public static void main(String[] args) {
		Bike car = new Bike();
		car.noOfWheels();
		car.brandName();
		car.noOfVehicles();
}
}