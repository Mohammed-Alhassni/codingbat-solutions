package src.String1;

public class extraFront {
    public String extraFront(String str) {
        if (str.length()>2) {
            String firstTwo=str.substring(0, 2);
            return firstTwo+firstTwo+firstTwo;
        }
        return str+str+str;
    }
}
