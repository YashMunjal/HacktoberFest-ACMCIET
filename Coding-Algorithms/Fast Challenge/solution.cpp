#include <iostream>
#include<string>
using namespace std;
int main() {
    string s,sub;
    int n;
    getline(cin,s);
    cin>>sub;
    cin>>n;
    int ans = 0,step = 0;
    while(step<n){
        ans = s.find(sub,ans);
        step++;
        if(step<n){
            ans++;
        }
    }
    cout<<ans;
    return 0;
}
