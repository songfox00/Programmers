#include <string>
#include <queue>
#include <cmath>
using namespace std;

int solution(vector<int> players, int m, int k) {
    int answer = 0;
    int running=0;
    queue<int>q;
    
    for(int i=0;i<24;i++){
        
        while(!q.empty() && q.front()==i){
            q.pop();
            running--;
        }
        
        int required=ceil(players[i]/m);
        if(required>running){
            int newServer=required-running;
            running+=newServer;
            answer+=newServer;
            
            for(int j=0;j<newServer;j++)
                q.push(i+k);
        }    
        
    }
    
    return answer;
}