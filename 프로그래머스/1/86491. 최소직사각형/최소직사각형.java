class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for(int[] ele : sizes){
            if(ele[0] > ele[1]){
                if(ele[0]>w) w = ele[0];
                if(ele[1]>h) h = ele[1];
            } else {
                if(ele[1]>w) w = ele[1];
                if(ele[0]>h) h = ele[0];  
            }
        }
        return w * h;
    }
}