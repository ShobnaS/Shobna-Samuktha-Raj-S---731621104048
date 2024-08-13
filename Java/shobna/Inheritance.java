package shobna;
class TwoWheeler {
	void noOfWheels() {
		System.out.println("Two wheels");
	}
}
class Car extends TwoWheeler {
	void brandName() {
		System.out.println("Four wheels");
	}
}
public class Inheritance {
    public static void main(String[] args) {
		Car car = new Car();
		car.noOfWheels();
		car.brandName();
	}
}
