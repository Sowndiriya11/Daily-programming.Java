import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int n=sc.nectInt();
    int reverse=0;
    while(n!=0){
     int digit=n%10;
    reverse=reverse*10+digit;
    n=n/10;
  }
    System.out.println("Reverse Number:"+10);
}
}
