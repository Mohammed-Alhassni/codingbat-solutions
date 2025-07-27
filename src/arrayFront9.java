package src;

public class arrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int iterations= nums.length;
        if (nums.length >= 4) {iterations=4;}
        for (int i =0; i < iterations; i++){
            if (nums[i]==9){
                return true;
            }
        }
        return false;
    }
}
