package shobna;

public class Variables {
	 int b= 20;//Instance variable
	 static int c = 20; // Static or class variable
      public static void main(String[] args) {
    	int a = 10 ; //Local Variable
		System.out.println("Local Variable :" + a);
		Variables var = new Variables();
		System.out.println(var.b);
		System.out.println(Variables.c);
	}
}
