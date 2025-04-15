class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int pointer = section[0];
        for(int i = 1 ; i < section.length ; i++){
            if(section[i] <= pointer + m -1) continue;
            else {
                pointer = section[i];
                answer++;
             }
        }
        return answer;
    }
}