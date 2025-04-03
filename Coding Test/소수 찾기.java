import java.util.*;
import java.io.*;

class Solution {
    static ArrayList<Integer>arr = new ArrayList<>();
    static boolean[] visited=new boolean[7];
    
    private static boolean isPrime(int num){
        if(num<2)
            return false;
        
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
            
    public int solution(String numbers) {
        int answer = 0;
        
        for(int i=0;i<numbers.length();i++){
            back(numbers, "", i+1);
        }
        
        for(int i=0;i<arr.size();i++){
            if(isPrime(arr.get(i)))
                answer++;
        }
            
        return answer;
    }
            
    private static void back(String str, String tmp, int depth){
        if(depth==tmp.length()){
            int num=Integer.parseInt(tmp);
            if(!arr.contains(num))
                arr.add(num);
        }
        
        for(int i=0;i<str.length();i++){
            if(!visited[i]){
                tmp+=str.charAt(i);
                
                visited[i]=true;
                back(str,tmp,depth);
                visited[i]=false;
                
                tmp=tmp.substring(0,tmp.length()-1);
            }
        }
    }    
}