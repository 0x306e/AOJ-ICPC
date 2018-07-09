#include "bits/stdc++.h"
using namespace std;

int main(){
    char s[108];
    stack<char> stk;
    int no = 0;
    cin.getline(s, 101);
    while(s[0] != '.' && s[1] != '\0'){
        for(int i = 0;; i++){
            if(s[i] == '(') stk.push('(');
            if(s[i] == '[') stk.push('[');
            if(s[i] == ')'){
                if(stk.empty() || stk.top() != '('){
                    no = 1;
                    break;
                }
                stk.pop();
            }
            if(s[i] == ']'){
                if(stk.empty() || stk.top() != '['){
                    no = 1;
                    break;
                }
                stk.pop();
            }
            if(s[i] == '\0') break;
        }
        if(no == 0){
            printf("yes\n");
        } else {
            printf("no\n");
        }
        while(!stk.empty()){
            stk.pop();
        }
        no = 0;
        cin.getline(s, 101);
    }
}
