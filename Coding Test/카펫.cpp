#include <vector>

using namespace std;

vector<int> solution(int brown, int yellow) {
    vector<int> answer;
    int x,y;
    
    for(int i=1;i<=yellow;i++){
        if(yellow%i==0){
            x=i;
            y=yellow/i;
            
            int b_size=(x+2)*(y+2) - x*y;
            if(b_size==brown){
                answer.push_back(y+2);
                answer.push_back(x+2);
                break;
            }
                
        }
    }
    
    return answer;
}