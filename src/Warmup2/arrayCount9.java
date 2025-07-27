package src.Warmup2;

public class arrayCount9 {
    public int arrayCount9(int[] nums) {
        int count=0;
        for (int num: nums){
            if (num==9){
                count ++;
            }
        }
        return count;
    }
}
