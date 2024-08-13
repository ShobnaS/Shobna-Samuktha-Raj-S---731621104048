package shobna;
class Vehicless {
	void noOfVehicles() {
		System.out.println("Hundred");
     }
}
class ThreeWheeler extends Vehicless{
	void noOfWheels() {
		System.out.println("Two wheels");
	}
}
class Bikes extends ThreeWheeler {
	void brandName() {
		System.out.println("Four wheels");
	}
}
class Scooty extends ThreeWheeler {
	void brandName() {
		System.out.println("Four wheels");
	}
}
public class Hierrachial {
  public static void main(String[] args) {
	Bikes car = new Bikes();
    car.noOfWheels();
	car.brandName();
	car.noOfVehicles();

	Scooty three = new Scooty();
	three.noOfWheels();
	three.brandName();
	three.noOfVehicles();
}
}