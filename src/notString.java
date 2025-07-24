package src;

public class notString {
    public String notString(String str) {
        return str.startsWith("not")? str: "not " + str;
    }
}
