class Solution {
    public void reverseArray(int arr[]) {
        int Length=arr.length-1;
        int Length1=Length;
        for(int i=0;i<=Length1/2;i++){
            int temp=arr[i];
            arr[i]=arr[Length];
            arr[Length]=temp;
            Length--;
        }
    }
}
