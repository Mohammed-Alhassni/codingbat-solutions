package src.Array1;

public class midThree {
    public int[] midThree(int[] nums) {
        int middleIndex=Math.round(nums.length/2);
        int[] newArr = {nums[middleIndex-1], nums[middleIndex], nums[middleIndex+1]};
        return newArr;
    }
}
