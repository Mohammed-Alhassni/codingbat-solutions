package src.Array1;

public class makeLast {
    public int[] makeLast(int[] nums) {
        int[] newArr= new int[nums.length * 2];
        for (int i=0; i <newArr.length; i++){
            if (i==newArr.length-1){
                newArr[i]= nums[nums.length-1];
            }else {
                newArr[i] = 0;
            }
        }
        return newArr;
    }
}
