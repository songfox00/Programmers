import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> m= new HashMap<>();
        
        for(int i=0;i<participant.length;i++){
            String key=participant[i];
            if(m.containsKey(key)){
                int value=m.get(key);
                m.put(key,value+1);
            }
            else{
                m.put(key,1);
            }
        }
        
        for(int i=0;i<completion.length;i++){
            String key=completion[i];
            
            int value=m.get(key);
            
            if(value==1){
                m.remove(key);
            }
            else
                m.put(key,value-1);  
        }
        
        for(String key: m.keySet()){
            answer=key;
        }
        return answer;
    }
}
