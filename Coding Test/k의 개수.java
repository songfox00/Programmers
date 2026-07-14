class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int x=i;x<=j;x++){
            String str=Integer.toString(x);
            for(int y=0;y<str.length();y++){
                if(str.charAt(y)-'0'==k)
                    answer++;
            }
        }
        
        return answer;
    }
}