import java.util.*;
public class Main{
public static int lengthOfLastWord(String s){
  if(s==null || s.length()==0) return 0;
s=s.trim();
int lastSpaceIndex=s.lastIndexOf(' ');
if(lastSpaceIndex==-1){
  return s.length();
} else{
  return s.length()-lastSpaceIndex-1;
}
}
public static void main(String[]args){
  String input="Hello World";
  int length=lengthOfLastWord(input);
  System.out.println("Length of last word: " +length);
}
}
