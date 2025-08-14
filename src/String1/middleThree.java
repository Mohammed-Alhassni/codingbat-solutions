package src.String1;

public class middleThree {
    public String middleThree(String str) {
        int midIndex= Math.round(str.length()-1)/2;
        return str.substring(midIndex-1, midIndex+2);
    }
}
