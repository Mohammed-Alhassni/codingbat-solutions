package src.String1;

public class twoChar {
    public String twoChar(String str, int index) {
        if (index<str.length()-1 && index >0){
            return str.substring(index, index+2);
        }
        return str.substring(0,2);
    }
}
