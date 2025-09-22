import java.util.*;

class Solution {
    public int solution(String input) {
        
        int[] rslt = new int[3];
        char[] arr = input.toCharArray();
        
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 49 && arr[i + 1] == 48) {
                idx++;
                rslt[idx] = 10;
                i++;
                continue;
            } else if (arr[i] >= 48 && arr[i] <= 57) {
                idx++;
                rslt[idx] = arr[i] - 48;
                continue;
            }
            
            switch (arr[i]) {
                case 'D':
                    rslt[idx] = (int) Math.pow(rslt[idx], 2);
                    break;
                case 'T':
                    rslt[idx] = (int) Math.pow(rslt[idx], 3);
                    break;
                case '*':
                    rslt[idx] *= 2;
                    if (idx - 1 >= 0) {
                        rslt[idx - 1] *= 2;
                    }
                    break;
                case '#':
                    rslt[idx] *= -1;
            }
        }
            
        return rslt[0] + rslt[1] + rslt[2];
    }
}