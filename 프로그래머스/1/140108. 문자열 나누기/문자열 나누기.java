class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        char cur = ' ';
        int cnt = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(cnt == 0) {
                cur = arr[i];
                cnt++; continue;
            }
            if(cur == arr[i]) cnt++;
            else cnt--;
            
            if(cnt == 0) answer++;
        }
        if(cnt != 0) answer++;
        return answer;
    }
}