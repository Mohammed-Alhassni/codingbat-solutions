package src.Array1;

public class start1 {
    public int start1(int[] a, int[] b) {
        int countOne=0;
        if (a.length > 0 && a[0]==1) countOne++;
        if (b.length > 0 && b[0]==1) countOne++;
        return countOne;
    }
}
