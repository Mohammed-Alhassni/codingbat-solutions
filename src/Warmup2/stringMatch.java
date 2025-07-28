package src.Warmup2;

public class stringMatch {
    public int stringMatch(String a, String b) {
        int count=0;
        int iterations= b.length()-2;
        if (a.length() <= b.length()){iterations= a.length()-2;}
        for(int i=0; i <= iterations; i++){
            if (a.substring(i, i+2).equals(b.substring(i, i+2))){count++;}
        }
        return count;
    }
}
