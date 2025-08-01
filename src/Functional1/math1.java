package src.Functional1;

import java.util.List;

public class math1 {
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(num-> (1+num)*10);
        return nums;
    }
}
