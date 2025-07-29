package src.Array1;

public class middleWay {
    public int[] middleWay(int[] a, int[] b) {
        int aMid= Math.round(a.length/2);
        int bMid= Math.round(b.length/2);
        int[] newArr= {a[aMid], b[bMid]};
        return newArr;
    }
}
