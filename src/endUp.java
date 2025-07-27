package src;

public class endUp {
    public String endUp(String str) {
        if (str.length() >= 3){
            String firstHalf= str.substring(0, str.length()-3);
            String secondHalf= str.substring(str.length()-3, str.length()).toUpperCase();
            return firstHalf+secondHalf;
        }
        return str.toUpperCase();
    }
}
