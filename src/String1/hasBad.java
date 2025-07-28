package src.String1;

public class hasBad {
    public boolean hasBad(String str) {
        if (str.length()> 3){
            return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
        } else if (str.length()== 3) {
            return str.equals("bad");
        }
        return false;
    }
}
