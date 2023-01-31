class Solution {
public:
    int maxCoins(vector<int>& A) {
        int ans = 0 ;
        sort(A.begin() , A.end() );  //sort
        int n = A.size()/3, i = A.size()-2; // start from 2nd last element 
		// we observe that biggest is taken by 1st person 
		// 2nd largest added to score hence 
		// add  each 2nd element from sorted array  ie n/3 times
        while(n--){
            ans+= A[i];
            i-=2;
        }
        return ans;
    }
};
