package src.Array1;

public class unlucky1 {
    public boolean unlucky1(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if ((i==0 || i==1 || i==nums.length-2 || i==nums.length-1) && nums[i]==1){
                if(nums.length > i+1 && nums[i+1]==3) return true;
            }
        }
        return false;
    }
}
