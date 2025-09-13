import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    while(b!=0){
      int temp=b;
      b=a%b;
      a=temp;
    }
    System.out.println("GCD = "+a);
  }
}
      
