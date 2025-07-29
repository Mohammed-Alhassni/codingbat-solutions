package src.Array1;

public class rotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int[] newNums= new int[nums.length];
        for (int i=0; i<nums.length; i++){
            if (i < nums.length-1){
                newNums[i]= nums[i+1];
            }
        }
        newNums[newNums.length-1]= nums[0];
        return newNums;
    }
}
