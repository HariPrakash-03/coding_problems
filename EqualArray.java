class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        int i=0;
        int size=arr2.length;
        for(int j=0;j<size;j++)
        {
            if(arr1[i]==arr2[j])
            {
                int temp=arr2[j];
                arr2[j]=arr2[size-1];
                arr2[size-1]=temp;
                size--;
                i++;
                j=-1;
            }
        }
        if(size==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
