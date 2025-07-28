package src.String1;

public class middleTwo {
    public String middleTwo(String str) {
        int midIndex= str.length()/2;
        return str.substring(midIndex-1,midIndex+1);
    }
}
