import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len=numbers.length-1;
        
        Arrays.sort(numbers);
        
        answer=numbers[len]*numbers[len-1];
        
        return answer;
    }
}