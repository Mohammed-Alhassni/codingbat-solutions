package src.String1;

public class endsLy {
    public boolean endsLy(String str) {
        if (str.length() >= 2){
            return (str.substring(str.length()-2).equals("ly"));
        }
        return false;
    }
}
