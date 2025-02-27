import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        boolean isEven = n % 2 == 0 ? true : false;
        int rslt = IntStream.rangeClosed(0,n)
            .filter((e)->{
                if(isEven){
                    return e % 2 == 0 ? true : false;
                } else {
                    return e % 2 == 0 ? false : true;
                }
            })
            .reduce((s,e)->{
                if(!isEven) return s + e;
                else return s + (int)Math.pow(e,2); 
            })
            .getAsInt();
        return rslt;
    }
}