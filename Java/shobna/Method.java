package shobna;

public class Method {
    void myMethod() {
    	System.out.println("Instance Method");
    }
    static void myMethod2() {
    	System.out.println("Static Method");
    }
    public static void main(String[] args) {
		Method meth = new Method();
		meth.myMethod();
		Method.myMethod2();
	}
}
