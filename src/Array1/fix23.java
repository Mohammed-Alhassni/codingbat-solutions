package src.Array1;

public class fix23 {
    public int[] fix23(int[] nums) {
        int[] newArr= new int[3];
        for (int i=0; i<nums.length;i++){
            if (nums[i]==2){
                newArr[i]=nums[i];
                if (nums[i+1]==3){newArr[i+1]=0; i++;}
            } else {
                newArr[i]=nums[i];
            }
        }
        return newArr;
    }
}
