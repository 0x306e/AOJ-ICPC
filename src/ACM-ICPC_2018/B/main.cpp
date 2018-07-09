#define _overload3(_1,_2,_3,name,...) name
#define _rep(i,n) repi(i,0,n)
#define repi(i,a,b) for(int i=int(a);i<int(b);++i)
#define rep(...) _overload3(__VA_ARGS__,repi,_rep,)(__VA_ARGS__)
#include "bits/stdc++.h"
using namespace std;
typedef long long ll;

int main(int argc, char* argv[]){
    int n, m, t, p;
    int d[30];
    int c[30];
    int x[30];
    int y[30];
    int wid, hei;
    // n = width, x axis
    // m = height, y axis
    while(true){
        cin >> n >> m >> t >> p;
        if(n == 0) break;
        rep(i, t) cin >> d[i] >> c[i];
        rep(i, p) cin >> x[i] >> y[i];
        // input end 

        wid = n;
        hei = m;
        int mp[40][40] = {};
        rep(i, n) rep(j, m) mp[i][j] = 1;

        // fold
        rep(z, t){
            if(d[z] == 1){
                // left to 
                rep(j, hei){
                    rep(i, c[z]){
                        mp[c[z] * 2 - 1 - i][j] += mp[i][j];
                        mp[i][j] = 0;
                    }
                }
            } else {
                // below to 
                rep(i, wid){
                    rep(j, c[z]){
                        mp[i][c[z] * 2 - 1 - j] += mp [i][j];
                        mp[i][j] = 0;
                    }
                }
            }

            // tumeru
            rep(i, wid){
                bool allzero = true;
                rep(j, hei) if(mp[i][j] != 0) allzero = false;
                if(!allzero){
                    while(mp[i][0] == 0){
                        rep(k, hei) mp[i][k] = mp[i][k+1];
                    }
                }
            }

            rep(j, hei){
                bool allzero = true;
                rep(i, wid) if(mp[i][j] != 0) allzero = false;
                if(!allzero){
                    while(mp[0][j] == 0){
                        rep(k, wid) mp[k][j] = mp[k+1][j];
                    }
                }
            }

            // fix wid, hei
            rep(i, wid){
                if(mp[i][0] == 0) wid = i;
                break;
            }
            rep(j, hei){
                if(mp[0][j] == 0) hei = j;
                break;
            }
        }
        // end fold
        
        // data check
        //cout << "nmtp : " << n << ", " << m << ", " << t << ", " << p << endl;
        //rep(i, 11){
        //    rep(j, 11){
        //        cout << mp[i][j] << " ";
        //    }
        //    cout << endl;
        //}

        rep(i, p){
            cout << mp[x[i]][y[i]] << endl;
        }
    }
}


