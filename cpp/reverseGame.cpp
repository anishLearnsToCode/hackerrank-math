#include <iostream>
using namespace std;

int main() {
    int t, n, k;
    cin >> t;
    while (t--) {
        cin >> n >> k;
        if (k < n / 2) {
            cout << (2 * k + 1) << "\n";
        } else {
            cout <<  (n - 1 - k) * 2 << "\n";
        }
    }
    return 0;
}

