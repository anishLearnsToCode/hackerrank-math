// https://www.hackerrank.com/challenges/diwali-lights

#include <iostream>
using namespace std;

int main() {
    int t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        int n, ans = 1;
        cin >> n;
        for (int i = 0; i < n; i++) {
            ans = ans * 2;
            ans = ans % 100000;
        }
        cout << ans - 1 << endl;
    }
}

