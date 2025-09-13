import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence:");
    String str = sc.nextLine();
    String[]  words = str.trim().split("\\s+");
    System.out.println("Number of words:"+words.length);
  }
}
    
    
