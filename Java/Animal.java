import  java.util.*;
class Dog {
    private String name;
    private String breed;
    public Dog(String name,String breed){
       this.name = name;
       this.breed = breed;
      }
     public String getName() {
       return name;
     }
     public void setName(String name){
         this.name = name;
     }
     public String getBreed(){
        return breed;
     }
     public void setBreed(String breed){
        this.breed = breed;
     }
   }
 public class Animal {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String nam = sc.nextLine();
       String bred  = sc.nextLine();
       Dog dg = new Dog(nam,bred);
       System.out.println("Name :" + dg.getName());
       System.out.println("Breed :" + dg.getBreed());
       dg.setName("Browny");
       dg.setBreed("Sheperd");
       System.out.println("Updated Title :" + dg.getName());
       System.out.println("Updated Author :" + dg.getBreed());
    }
}
      