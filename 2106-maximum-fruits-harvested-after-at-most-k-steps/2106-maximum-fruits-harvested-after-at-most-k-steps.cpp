class Solution {
public:
    int maxTotalFruits(vector<vector<int>>& fruits, int startPos, int k) {
        int curSum=0;
        int maxSum=0;

        for(int i=0,j=0; j<fruits.size(); j++) {
            int JStep=fruits[j][0];
            int Jfruits=fruits[j][1];
            curSum+=Jfruits;

            while(i<=j && (JStep - fruits[i][0] + min(abs(startPos - JStep), abs(startPos - fruits[i][0])) > k)) {
                curSum-=fruits[i][1];
                i++;
            }
            maxSum = max(curSum, maxSum);
        }
        return maxSum;
    }
};