package src.String1;

public class nTwice {
    public String nTwice(String str, int n) {
        return str.substring(0, n)+str.substring(str.length()-n);
    }
}
