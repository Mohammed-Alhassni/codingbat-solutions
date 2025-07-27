package src.Warmup2;

public class countXX {
    int countXX(String str) {
        int count= 0;
        for (int i= 0; i <= str.length()-1; i++){

            if (!(str.length() < i+2)){
                if (str.substring(i, i+2).equals("xx")) count++;
            }
        }

        return count;
    }
}
