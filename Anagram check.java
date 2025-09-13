import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first string:");
    String str1=sc.nextLine();
    System.out.print("Enter second string:");
    String str2=sc.nextLine();
    char[]arr1=str1.toCharArray();
    char[]arr2=str2.toCharArray();
    if(arr1.length!=arr2.length){
      System.out.println("Not Anagram");
      return;
    }
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      if(Arrays.equals(arr1,arr2)){
        System.out.println("Anagram");
      }else{
        System.out.println("Not Anagram");
      }
    }
  }
