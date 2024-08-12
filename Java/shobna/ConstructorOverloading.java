package shobna;

public class ConstructorOverloading {
	 ConstructorOverloading(String name) {
 	   System.out.println("Welcome "+ name);
    }
	 ConstructorOverloading(int a ,int b) {
		this("Shobna");
 	   System.out.println("Sum "+ (a+b));
    }
	 ConstructorOverloading(int n) {
		 this(10,20);
 	   System.out.println("Sum "+ (n+n));
    }
    public static void main(String[] args) {
    	//ConstructorOverloading obj1 = new ConstructorOverloading("Shobna");
    	//ConstructorOverloading obj2 = new ConstructorOverloading(10,20);	
    	ConstructorOverloading obj3 = new ConstructorOverloading(5);
    }
}

