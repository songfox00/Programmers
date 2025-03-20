#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(int n, int w, int num) {
    int answer = 0;
    vector<vector<int>>v;
    int h=(n-1)/w+1;
    int x=1;
    
    for(int k=0;k<h;k++){
        vector<int>list;
        for(int i=1;i<=w;i++){
            if(x <= n)
                list.push_back(x++);
        }
        
        if(x>n){
            for(int i=0;i<(w - (n % w)) % w;i++){   //마지막에 %w를 추가해야 꽉 찬 경우도 고려려
                list.push_back(0);
            }
        }
        if(k%2!=0)
            reverse(list.begin(), list.end());
    
        v.push_back(list);
    }

    for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){  
            if(v[i][j]==num){
                 answer=h-i;
                
                if(v[h-1][j]==0)
                    answer--;
                    
                return answer;
            }   
        }
    }

}