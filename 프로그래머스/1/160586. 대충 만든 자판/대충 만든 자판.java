import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] rsltArr = new int[targets.length];
        int[] idxArr = new int[26];

        for (String s : keymap) {
            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                int c = chars[i] - 65;

                if (idxArr[c] == 0) {
                    idxArr[c] = i + 1;
                } else {
                    idxArr[c] = Math.min(idxArr[c], i + 1);
                }
            }
        }

        outer:
        for (int i = 0; i < targets.length; i++) {
            char[] chars = targets[i].toCharArray();
            int rslt = 0;

            for(char c : chars) {
                if(idxArr[c-65] == 0) {
                    rsltArr[i] = -1;
                    continue outer;
                }
                rslt += idxArr[c-65];
            }

            rsltArr[i] = rslt == 0 ? -1 : rslt;
        }
        
        return rsltArr;
        
    }
}