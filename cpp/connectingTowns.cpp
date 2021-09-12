#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    while (n--) {
        int t;
        long long sum = 1;
        cin >> t;
        for (int j = 0; j < t - 1; j++) {
            long long x;
            cin >> x;
            sum = ((sum % 1234567) * (x % 1234567)) % 1234567;
        }
        cout << sum << endl;
    }
}

