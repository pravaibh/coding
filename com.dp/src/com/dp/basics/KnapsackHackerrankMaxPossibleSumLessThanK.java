//Knapsack problem from hackerrank. Find max possible sum not exceeding k in the given array of numbers

int max = -1;
        boolean[][] m = new boolean[arr.length][k+1];
        Arrays.sort(arr);
        for(int i = 0; i < k + 1; i++) {
            if(i % arr[0] == 0) {
                m[0][i] = true;
            }
            
        }
        for(int i = 1; i < m.length; i++) {
            for(int j = 0; j < k + 1; j++) {
                if(j < arr[i] || m[i-1][j]) {
                    m[i][j] = m[i-1][j];
                } else {
                    m[i][j] = m[i][j-arr[i]];
                }
            }
        }
        for(int j = k; j >= 0; j--) {
            if(m[arr.length - 1][j] == true) {
                max = j;
                break;
            }
        }
        return max;
