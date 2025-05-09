class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left ; i <= right ; i ++){
             answer += func(i) ? i : -i;
        }
        return answer;
    }
    
    public boolean func(int num){
        int cnt = 0;
        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0) cnt++;
        }
        return cnt % 2 == 0;
    }
}