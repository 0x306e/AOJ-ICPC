#include "bits/stdc++.h"
using std::cin;
using std::cout;

int cnt = 0;
char map[21][21];

void dfs(int x, int y, int mx, int my){
    if((x < 0) || (x >= mx)){
        return;
    }
    if((y < 0) || (y >= my)){
        return;
    }
    if(map[x][y] == '#'){
        return;
    }
    map[x][y] = '#';
    cnt++;
    dfs(x+1, y, mx, my);
    dfs(x-1, y, mx, my);
    dfs(x, y+1, mx, my);
    dfs(x, y-1, mx, my);
}

int main(){
    int W, H, sx, sy;
    cin >> W >> H;

    while(W != 0 && H != 0){
        for(int i = 0; i < H; i++){
            scanf("%20s", map[i]);
            if(std::string(map[i]).find('@') != std::string::npos){
                sx = i;
                sy = std::string(map[i]).find('@');
            }
        }
        dfs(sx, sy, H, W);
        cout << cnt << std::endl;

        cin >> W >> H;
        cnt = 0;
        
    }
}