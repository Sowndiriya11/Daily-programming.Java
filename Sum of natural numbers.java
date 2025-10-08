import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a positive number:");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
      sum=sum+i;
    }
    System.out.println("Sum of first "+n+"natural numbers is:"+sum);
  }
}
