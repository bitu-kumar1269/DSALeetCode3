class Solution {
    public long sumAndMultiply(int n) {
        long place = 1;
        long x = 0;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            if(digit != 0){
                x = digit * place + x;
                sum += digit;
                place *= 10;
            }
            n /=10;
        }
        
        return x * sum;
    }
}