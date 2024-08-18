class Solution {
    static String armstrongNumber(int n) {
        int ArmStrong=0;
        int num = n;
        while(num>0)
        {
            int Singledigit=num%10;
            ArmStrong+=Math.pow(Singledigit,3);
            num=num/10;
        }
        if(n==ArmStrong)
        {
            return "true";
        }
        else
        {
            
            return "false";
        }
    }
}
