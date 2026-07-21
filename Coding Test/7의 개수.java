class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int n:array){
            String str=Integer.toString(n);
            
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                
                if(c=='7')
                    answer++;
            }
        }
    
        return answer;
    }
}