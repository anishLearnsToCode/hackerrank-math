// https://www.hackerrank.com/challenges/bus-station

#include <iostream>
#include <vector>
#include <set>
#include <algorithm>

using namespace std;

bool check(const set<int> &mm, int val, int sum) {
    if (sum / val > mm.size()) {
        return false;
    }
    for (int i = val; i < sum; i += val) {
        if (mm.find(i) == mm.end()) {
            return false;
        }
    }
    return true;
}

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    int sum = 0;
    set<int> mm;
    for (int i = 0; i < n; i++) {
        cin >> a[i];
        sum += a[i];
        mm.insert(sum);
    }
    vector<int> res;
    for (int i = 1; i * i <= sum; i++) {
        if (sum % i == 0) {
            if (check(mm, sum / i, sum)) {
                res.push_back(sum / i);
            }
            if (i * i != sum && check(mm, i, sum)) {
                res.push_back(i);
            }
        }
    }
    sort(res.begin(), res.end());
    for (int i = 0; i < res.size(); i++) {
        cout << res[i] << " ";
    }
    cout << endl;
    return 0;
}

