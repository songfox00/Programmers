#include<vector>
#include<algorithm>
#include<queue>
using namespace std;

int dx[4]={1,-1,0,0}, dy[4]={0,0,1,-1};
bool visit[101][101]={false,};

int solution(vector<vector<int>> maps)
{   
    int answer=0;
    int n=maps.size();
    int m=maps[0].size();
    int dist[101][101]={0,};
    
    queue<pair<int,int>>q;
    q.push({0,0});
    visit[0][0]=true;
    dist[0][0]=1;
    
    while(!q.empty()){
        int x=q.front().first;
        int y=q.front().second;
        q.pop();
        
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            
            if(nx>=0 && nx<n && ny>=0 && ny<m && maps[nx][ny]==1 && !visit[nx][ny]){
            visit[nx][ny]=true;
            q.push({nx,ny});
            dist[nx][ny]=dist[x][y]+1;
            }   
        }
    }
    
    answer=dist[n-1][m-1];
    if(visit[n-1][m-1]==false)
        answer=-1;        
    
    return answer;
}