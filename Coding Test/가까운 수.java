class Solution {
    public int solution(int[] array, int n) {
        int answer = 101, min=101;
            
        for(int i=0;i<array.length;i++){
            int gap=Math.abs(array[i]-n);
            if(gap<min){
                min=gap;
                answer=array[i];
            }
            else if(gap==min && array[i]<answer)
                answer=array[i];
                
        }
        
        return answer;
    }
}