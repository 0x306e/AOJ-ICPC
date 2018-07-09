#define _overload3(_1,_2,_3,name,...) name
#define _rep(i,n) repi(i,0,n)
#define repi(i,a,b) for(int i=int(a);i<int(b);++i)
#define rep(...) _overload3(__VA_ARGS__,repi,_rep,)(__VA_ARGS__)
#include "bits/stdc++.h"
using namespace std;
typedef long long ll;

int main(int argc, char* argv[]){
    int n;
    string a = "aiueo";
    vector<string> v(50);
    vector<string> ans(50);
    vector<string> st;
    while(true){
        cin >> n;
        v.clear();
        bool flag = true;
        if(n == 0) break;
        rep(i, n) cin >> v[i];
        rep(i, n){
            string s = v[i];
            string c = "";
            c += s[0];
            rep(i, s.size()){
                rep(j, a.size()) if(s[i] == a[j]) c += s[i+1];
            }
            st.push_back(c);
        }
        sort(st.begin(), st.end());
        rep(i, n) cout << st[i] << endl;
        rep(i, n) rep(j, n) if(st[i] == st[j]) flag = false;
        int mn = 50;
        rep(i, n){
            int sz = st[i].size();
            mn = min(mn, sz);
        }

        if(flag) cout << mn << endl;
        else cout << "-1" << endl;
    }
}


