package src.Array1;

public class sum2 {
    public int sum2(int[] nums) {
        int sum= 0;
        for (int i=0; i < nums.length; i++){
            if (i<2){sum+= nums[i];}
        }
        return sum;
    }
}
