package src.Array1;

public class makeMiddle {
    public int[] makeMiddle(int[] nums) {
        int middleIndex= nums.length/2;
        int[] newArr = new int[2];
        newArr[0]= nums[middleIndex-1];
        newArr[1]= nums[middleIndex];
        return newArr;
    }
}
