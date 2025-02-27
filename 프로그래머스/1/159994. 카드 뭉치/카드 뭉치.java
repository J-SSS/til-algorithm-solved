class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cardIdx1 = 0;
        int cardIdx2 = 0;
        
        for(String str : goal){
            if(cardIdx1 < cards1.length && str.equals(cards1[cardIdx1])) {
                cardIdx1++;
                continue;
            } else if(cardIdx2 < cards2.length && str.equals(cards2[cardIdx2])) {
                cardIdx2++;
                continue;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}