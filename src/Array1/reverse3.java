package src.Array1;

public class reverse3 {
    public int[] reverse3(int[] nums) {
        int[] newArr= new int[nums.length];
        for (int i=0; i < nums.length; i++){
            newArr[i]= nums[nums.length-1-i];
        }
        return newArr;
    }
}
