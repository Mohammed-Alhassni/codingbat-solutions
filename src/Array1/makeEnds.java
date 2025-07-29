package src.Array1;

public class makeEnds {
    public int[] makeEnds(int[] nums) {
        int[] newArr= new int[2];
        newArr[0]= nums[0];
        newArr[1]= nums[nums.length-1];
        return newArr;
    }
}
