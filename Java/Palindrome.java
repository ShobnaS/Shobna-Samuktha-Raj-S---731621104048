import java.util.*;
public class Palindrome{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int arr[] = new int[n1];
   for(int i=0 ; i<arr.length;i++)
   {
     arr[i] = sc.nextInt();
   }
   boolean isPalindrome = true ;
   int left = 0;
   int right = arr.length -1 ;
   while(left < right){
     if(arr[left]!= arr[right]){
      isPalindrome = false;
      break ;
    }
     left ++;
     right --;
}
if(isPalindrome)
{
  System.out.print("Palindrome");
}
else{
 System.out.print("Not Palindrome");
    }
  }
 }
  