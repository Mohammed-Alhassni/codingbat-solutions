package src;

public class last2 {
    public int last2(String str) {
        int count =0;

        if (str.length()>2) {
            String lastTwo= str.substring(str.length()-2);
            for (int i=0; i <= str.length()-3; i++){
                if (str.substring(i, i+2).equals(lastTwo)){
                    count++;
                }
            }
        }
        return count;
    }
}
