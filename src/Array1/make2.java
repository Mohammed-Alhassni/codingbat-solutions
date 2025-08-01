package src.Array1;

public class make2 {
    public int[] make2(int[] a, int[] b) {
        int[] newArr= new int[2];
        if (a.length==1){
            newArr[0]=a[0];
            newArr[1]=b[0];
        } else if (a.length > 1){
            newArr[0]=a[0];
            newArr[1]=a[1];
        } else {
            newArr[0]=b[0];
            newArr[1]=b[1];
        }
        return newArr;
    }
}
