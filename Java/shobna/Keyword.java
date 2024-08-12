package shobna;

public class Keyword {
      String name;
      Keyword(String name){
    	  this(10,200);
    	  this.name= name;
    	  this.greeting();
      }
      Keyword(int a , int b){
    	  System.out.println("Addition :" + (a + b));
      }
      void greeting() {
    	  System.out.println("Welcome :" + name);
      }
      public static void main(String[] args) {
    	  Keyword key = new Keyword("Shobna");
      }
}
