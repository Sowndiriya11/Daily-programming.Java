import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int removeIndex = 2; 
        
        int[] newArr = new int[arr.length - 1];
        
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == removeIndex) {
                continue;
            }
            newArr[k++] = arr[i];
        }
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
