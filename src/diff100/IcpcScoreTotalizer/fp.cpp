#include "bits/stdc++.h"
using namespace std;
typedef long long ll;

int main(int argc, char* argv[]){
    int n;
    int tmp, sum;
    vector<int> s;
    ifstream in;
    in.open("input", ios::in);
    ofstream out;
    out.open("output", ios::out);

    while(true) {
        in >> n;
        if(n == 0) return 0;
        sum = 0;
        s.clear();
        for(int i = 0; i < n; i++) {
            in >> tmp;
            s.push_back(tmp);
        }

        sort(s.begin(), s.end());
        for(int i = 1; i < n-1; i++){
            sum += s[i];
        }
        out << floor(sum * 1.0 / (n-2)) << endl;
    }
}


