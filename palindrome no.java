class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int remainder;
        int reverse = 0;

        while(temp > 0)
        {
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
        }

        return reverse == x;
    }
}
