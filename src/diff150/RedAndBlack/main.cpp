#define _overload3(_1,_2,_3,name,...) name
#define _rep(i,n) repi(i,0,n)
#define repi(i,a,b) for(int i=int(a);i<int(b);++i)
#define rep(...) _overload3(__VA_ARGS__,repi,_rep,)(__VA_ARGS__)
#include "bits/stdc++.h"
using namespace std;
typedef long long ll;

int main(int argc, char* argv[]){
    int dx[] = {0, 1, 0, -1};
    int dy[] = {1, 0, -1, 0};
    int w, h;
    int cnt = 0;
    int sx, sy;
    vector<string> v;
    while(true){
        cnt = 0;
        string tmp;
        v.clear();
        cin >> w >> h;
        if(w == 0 && h == 0) break;
        rep(i, h){
            cin >> tmp;
            v.push_back(tmp);
            if(tmp.find('@') != string::npos){
                sx = i;
                sy = tmp.find('@');
            }
        }
        
        queue<pair<int, int> > q;
        q.push({sx, sy});
        while(!q.empty()){
            pair<int, int> p = q.front();
            q.pop();
            // cout << "Now : " << p.first << " " << p.second << endl;
            if(p.first >= h
                || p.second >= w
                || p.first  < 0
                || p.second < 0
            )continue;
            if((v[p.first][p.second] == '.' || v[p.first][p.second] == '@')) {
                v[p.first][p.second] = '#';
                cnt++;
                rep(i, 4){
                    q.push({p.first + dx[i], p.second + dy[i]});
                }
            }
        }
        cout << cnt << endl;
    }
}


