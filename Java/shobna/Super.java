package shobna;
class A{
	int a = 10;
	void myMethod1() {
		System.out.println("I am a super class");
	}
	A(String name){
		System.out.println("Welcome :"+name);
	}
}
class B extends A{
   void myMethod2() {
		System.out.println("I am a sub class :" + super.a);
	    super.myMethod1();
   }
	B(){
		super("Shobna");
	}
}
public class Super {
  public static void main(String[] args) {
	B b = new B();
	b.myMethod2();
}
}
