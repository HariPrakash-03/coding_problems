class Solution
{
    public String is_palindrome(int n)
    {
        int reverse=0;
        int num = n;
        while(num>0)
        {
            int lastdigit=num%10;
            reverse=reverse*10+lastdigit;
            num=num/10;
        }
        if(n == reverse)
        {
            return"Yes";
        }
        else
        {
            return "No";
        }
    }
}
