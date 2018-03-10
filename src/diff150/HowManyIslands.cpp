#include "bits/stdc++.h"
using namespace std;

char c[102][102];

int mx, my;

void dfs(int x, int y){
    if(x < 0 || y < 0 || x >= mx || y >= my){
        return;
    }
    if(c[x][y] == '0'){
        return;
    }
    c[x][y] = '0';
    dfs(x+2, y);
    dfs(x+2, y+2);
    dfs(x+2, y-2);
    dfs(x-2, y);
    dfs(x-2, y+2);
    dfs(x-2, y-2);
    dfs(x, y+2);
    dfs(x, y-2);
    return;
}

int main(){
    int W, H, cnt = 0;
    cin >> W >> H;
    while(W != 0 && H != 0){
        mx = H;
        my = W;
        for(int i = 0; i < H; i++){
            scanf("%s\n", c[i]);
        }
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(c[i][j] == '1'){
                    cnt++;
                    dfs(i, j);
                }
            }
        }
        cout << cnt << endl;
        cin >> W >> H;
        cnt = 0;
    }
}