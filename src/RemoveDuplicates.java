class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int repeat=1;
        int repeatNum=nums[0];        
        int prev=nums[0];
        
        if (nums.length < 1)
            return 0;
            
        for (int i=1; i< nums.length;i++)
        {
            if (prev == nums[i])
            {
                repeatNum=nums[i];
                repeat++;
                
            }
            else
            {
                prev = nums[i];
            }
        }
        
        System.out.println(repeat);
        return 2;
        
    }
}

