package src.String1;

public class startWord {
    public String startWord(String str, String word) {
        boolean match=false;
        if (str.length() >= word.length()){
            match= str.substring(1, word.length()).equals(word.substring(1));
        }
        if (match){
            return str.substring(0, word.length());
        }
        return "";
    }
}
