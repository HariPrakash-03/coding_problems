class RemoveDuplicateInSortedArr{
    public int removeDuplicates(int[] nums) {
        int pointer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[pointer]!=nums[i]){
                nums[++pointer]=nums[i];
            }
        }
        return pointer+1;
    }
}
