package src.Array1;

public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int[] newArr= new int[nums.length];
        int largerVal= nums[nums.length-1];
        if (largerVal<nums[0]){largerVal=nums[0];}
        for (int i=0; i<newArr.length; i++){
            newArr[i]= largerVal;
        }
        return newArr;
    }
}
