package src.Array1;

public class frontPiece {
    public int[] frontPiece(int[] nums) {
        int[] newArr= new int[2];
        if (nums.length<=2) return nums;
        if (nums.length>2){
            newArr[0]=nums[0];
            newArr[1]=nums[1];
        }
        return newArr;
    }
}
