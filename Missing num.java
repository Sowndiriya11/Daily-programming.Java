import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array(n-1):");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter " + size + "Elements:");
    for(int i=0;i<=size;i++){
      arr[i]=sc.nextInt();
    }
    int n=size+1;
    int totalSum=n*(n+1)/2;
    int arraySum=0;
    for (int num:arr){
      arraySum+=num;
    }
    int missingNumber=totalSum-arraySum;
    System.out.println("Missing Number:"+missingNumber);
  }
}
