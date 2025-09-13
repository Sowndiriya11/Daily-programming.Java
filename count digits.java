import java.util.* ;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt();
    int count=0; 
    int temp=Math.abs(num);
    if(num==0){
      count=1;
    } else{
      while(temp>0){
        temp=temp/10;
        count++;
      }
    }
      System.out.println("Number od digits:"+count);
    }
  }

    
