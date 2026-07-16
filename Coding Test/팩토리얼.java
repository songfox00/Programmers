class Solution {
    public int solution(int n) {
        int answer = 1, fact=1;
        
        while(fact<=n){
            answer++;
            fact*=answer;
        }
        
        return answer-1;
    }
}