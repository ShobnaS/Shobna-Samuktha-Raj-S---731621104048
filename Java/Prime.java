import java.util.*;
public class Prime {
 public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int prime1 = sc.nextInt();
      Prime p = new Prime();
     // int c = 0,i=2;
     // while(i<=prime1/2){
     // if(prime1 % i ==0 ){
     //  c++;
     //}
    //i++;
  //}
 //if(c == 0){
  //  System.out.print("prime");
 // }
  //else{
  //   System.out.print("not prime");
//}
     if(prime1 > 1 && p.isPrime(prime1))
     {
        System.out.print("Prime");
     }
     else {
       System.out.print("Not Prime");
    }
}
    public boolean isPrime(int prime1){
     for(int i = 2; i<=prime1/2;i++){
       if(prime1 % 2 == 0){
         return false ;
       }
   }
      return true ;
    }

 }
