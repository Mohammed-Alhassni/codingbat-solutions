package src.Array1;

public class double23 {
    public boolean double23(int[] nums) {
        int countTwo=0;
        int countThree=0;
        for(int i =0; i<nums.length; i++){
            if (nums[i]==2) countTwo++;
            if (nums[i]==3) countThree++;
        }
        return (countTwo==2 || countThree==2);
    }
}
