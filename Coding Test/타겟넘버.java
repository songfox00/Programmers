import java.util.ArrayList;

class Solution {
    static int cnt=0;
    
    private static void dfs(int[] numbers, int target, int idx, int sum){
        if(idx==numbers.length){
            if(sum==target)
                cnt++;
                
            return;
        }
        
        dfs(numbers, target,idx+1,sum+numbers[idx]);
        dfs(numbers, target,idx+1, sum-numbers[idx]);
        
        return;
    }
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        
        int answer=cnt;

        return answer;
    }
}

