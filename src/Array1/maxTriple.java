package src.Array1;

public class maxTriple {
    public int maxTriple(int[] nums) {
        int largest= nums[(nums.length-1)/2];
        if(nums[0] > largest) largest= nums[0];
        if(nums[nums.length-1] > largest) largest= nums[nums.length-1];
        return largest;
    }
}
