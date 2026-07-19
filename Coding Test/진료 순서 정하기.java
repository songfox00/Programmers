class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int rank=1;
        
        for(int j=0;j<emergency.length;j++){
            int max=0, idx=-1;
            
            for(int i=0;i<emergency.length;i++){
                if(max<emergency[i]){
                    max=emergency[i];
                    idx=i;
                }
            }
            
            answer[idx]=rank++;
            emergency[idx]=0;
        }
        
        return answer;
    }
}