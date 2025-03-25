#include <string>
#include <vector>
#include <cmath>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    queue<int>q;
    int cnt=0;
    int target=100;
    
    for(int i=0;i<speeds.size();i++){
        int date=ceil((100-progresses[i])/(double)speeds[i]);
        
        if(i==0)
            target=date;
        
        if(target>=date){
            cnt++;
        }
        else{
            answer.push_back(cnt);
            cnt=1;
            target=date;
        }
    }
    
    answer.push_back(cnt);
    
    return answer;
}