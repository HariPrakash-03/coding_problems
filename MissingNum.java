class MissingNum {
    public static void main(String[] args) {
        int arr[] =  {1,3,2,5,7,6,4};
        int missingNum= missingNumber(arr);
        System.out.println("Missing Number is " + missingNum);
    }
    static int missingNumber(int arr[]) {
        int totalSum = 1;
        int arraySum = 0;
        for (int i=0;i<arr.length;i++)
        {
            totalSum+= i+2;
            arraySum+= arr[i];
        }
        return totalSum-arraySum ;
    }
}
