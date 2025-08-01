package src.Functional1;

import java.util.List;

public class square {
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(num -> num * num);
        return nums;
    }
}
