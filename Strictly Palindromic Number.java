class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i < n - 1; i++) {
            if (!checkPalin(Integer.toString(n, i))) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPalin(String s) {
        int p1 = 0, p2 = s.length() - 1;
        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2))
                return false;
            p1++;
            p2--;
        }
        return true;
    }
}
