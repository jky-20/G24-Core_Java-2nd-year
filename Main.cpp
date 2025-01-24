#include <iostream>
#include <vector>
using namespace std;

vector<vector<int>> rotateMatrix(vector<vector<int>> &matrix, int n, int m) {
    vector<vector<int>> rotated(m, vector<int>(n));

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            rotated[m - j - 1][i] = matrix[i][j];
        }
    }

    return rotated;
}

void printMatrix(const vector<vector<int>> &matrix) {
    for (const auto &row : matrix) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }
}

int main() {
    int n, m;
    cin >> n;
    cin >> m;

    vector<vector<int>> matrix(n, vector<int>(m));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> matrix[i][j];
        }
    }
    vector<vector<int>> rotated = rotateMatrix(matrix, n, m);
    printMatrix(rotated);

    return 0;
}
