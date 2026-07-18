class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cnt = 1, max=0;
        int[] mode=new int[1000];
        
        for(int i=0;i<array.length;i++){
            mode[array[i]]++;
        }
        
        for(int i=0;i<mode.length;i++){
            if(max<mode[i]){
                answer=i;
                max=mode[i];
                cnt=1;
            }
            else if(max==mode[i])
                cnt++;
        }
        
        if(cnt>1)
            answer=-1;
        
        return answer;
    }
}