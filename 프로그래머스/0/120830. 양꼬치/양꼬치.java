class Solution {
    public int solution(int n, int k) {
        int nPrice = n * 12000;
        int kService = n / 10;
        int kPrice = (k-kService) * 2000;
        
        return nPrice + kPrice;
    }
}