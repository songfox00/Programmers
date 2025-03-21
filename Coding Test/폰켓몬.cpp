#include <vector>
#include <map>

using namespace std;

int solution(vector<int> nums)
{
    int answer = 0;
    
    map<int,int>m;
    
    for(int i=0;i<nums.size();i++){
        m.insert({nums[i],1});
    }
    
    answer= m.size()>nums.size()/2? nums.size()/2 : m.size();
    
    return answer;
}