class Solution {
    public String solution(String s) {
        String answer = "";
        int[] alpha=new int[26];
        
        for(int i=0;i<s.length();i++){
            alpha[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<alpha.length;i++){
            if(alpha[i]==1)
                answer+=(char)(i+'a');
        }
        
        return answer;
    }
}