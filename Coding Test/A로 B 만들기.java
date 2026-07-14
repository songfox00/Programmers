class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] b_arr=new int[26];
        int[] a_arr=new int[26];
        
        for(int i=0;i<before.length();i++)
            b_arr[before.charAt(i)-'a']++;
        
        for(int i=0;i<after.length();i++)
            a_arr[after.charAt(i)-'a']++;
        
        for(int i=0;i<26;i++)
            if(a_arr[i]!=b_arr[i])
                answer=0;
        
        return answer;
    }
}