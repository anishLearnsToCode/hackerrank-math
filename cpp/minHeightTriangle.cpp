#include <iostream>
using namespace std;

int main() {
    int base, area;

    cin >> base >> area;

    cout << (area * 2 + (base - 1)) / base << endl;

    return 0;
}

