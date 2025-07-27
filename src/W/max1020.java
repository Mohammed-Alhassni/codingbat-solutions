package src.W;

public class max1020 {
    public int max1020(int a, int b) {
        int firstVal= 0;
        int secondVal= 0;

        if (a >=10 && a <= 20){firstVal= a;}
        if (b >=10 && b <= 20){secondVal= b;}
        if (firstVal >= secondVal){ return firstVal;}
        else return secondVal;
    }
}
