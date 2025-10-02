import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter rows for first matrix:");
    int r1=sc.nextInt();
    System.out.print("Enter columns for first:");
    int c1=sc.nextInt();
    System.out.print("Enter rows for second matrix:");
    int r2=sc.nextInt();
    System.out.print("Enter columns for second matrix:");
    int c2=sc.nextInt();
    if(c1!=r2){
      System.out.println("Matrix multiplication not possible!");
      return;
    }
    int [][]A=new int[r1][c1];
    int [][]B=new int[r2][c2];
    int [][]C=new int[r1][c2];
    System.out.println("Enter elements of first matrix:");
    for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
        A[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter elements of second matrix:");
    for(int i=0;i<r2;i++){
      for(int j=0;j<c2;j++){
        B[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<r1;i++){
      for(int j=0;j<c2;j++){
        C[i][j]=0;
        for(int k=0;k<c1;k++){
          C[i][j]+=A[i][k]*B[k][j];
        }
      }
    }
    System.out.println("Resultant Matrix:");
    for(int i=0;i<r1;i++){
      for(int j=0;j<c2;j++){
        System.out.print(C[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
