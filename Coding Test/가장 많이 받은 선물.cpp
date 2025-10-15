#include <bits/stdc++.h>

using namespace std;

int solution(vector<string> friends, vector<string> gifts) {
    int answer = 0;
    int N=friends.size();
    string name1, name2;
    map<string, int>idx;
    vector<vector<int>>v(N,vector<int>(N,0));
    vector<int>give(N,0);
    vector<int>receive(N,0);
    vector<int>next(N,0);
    
    for(int i=0;i<N;i++){
        idx[friends[i]]=i;
    }
    
    for(auto str : gifts){
        istringstream ss(str);
        ss>>name1>>name2;
        
        int a=idx[name1];
        int b=idx[name2];
        v[a][b]++;
        give[a]++;
        receive[b]++;
    }
    
    for(int i=0;i<N;i++){
        for(int j=i+1;j<N;j++){
            if(i==j)
                continue;
            
            int gij = v[i][j];
            int gji = v[j][i];
            
            if(gij!=gji){//선물을 주고 받음
                if(gij>gji)
                    next[i]++;
                else
                    next[j]++;
            }
            else{//기록x or 같음
                int gri=give[i]-receive[i];
                int grj=give[j]-receive[j];
                if(gri!=grj){//선물지수
                    if(gri>grj)
                        next[i]++;
                    else
                        next[j]++;
                }
            }
        }
    }
    
    for(int i=0;i<N;i++){
        answer=max(next[i],answer);
    }
    
    return answer;
}