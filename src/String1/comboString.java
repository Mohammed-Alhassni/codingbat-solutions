package src.String1;

public class comboString {
    public String comboString(String a, String b) {
        String shortStr= a;
        String longStr= b;
        if (a.length()>b.length()) {shortStr= b; longStr= a;}
        return shortStr+longStr+shortStr;
    }
}
