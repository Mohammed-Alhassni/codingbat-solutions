package src.String1;

public class without2 {
    public String without2(String str) {
        if (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length()-2))) return str.substring(2);
        return str;
    }
}
