public class max {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 7, 1, 9, 13};
        int max = a[0];
        int min=a[0];
        for (int i=0;i<a.length;i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum is " +max);
        for (int i=0;i<a.length;i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
            System.out.println("Min is " +min);

    }
}
