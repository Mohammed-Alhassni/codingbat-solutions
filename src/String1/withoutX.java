package src.String1;

public class withoutX {
    public String withoutX(String str) {
        int startIndex= 0;
        int endIndex= str.length();
        if (str.length()>0 && str.charAt(0)=='x') startIndex+= 1;
        if (str.length()>1 && str.charAt(str.length()-1)=='x') endIndex-= 1;
        return str.substring(startIndex, endIndex);
    }
}
