import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String rslt = "";
        for(char c : a.toCharArray()){
            if(c >= 97){
                rslt += String.valueOf(Character.toUpperCase(c));
            } else {
                rslt += String.valueOf(Character.toLowerCase(c));
            }
        }
        System.out.println(rslt);
    }
}