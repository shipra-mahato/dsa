import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] a = { 1, 2, 4 };
        int[] b = { 1, 3, 4, 5 };

        int[] c = new int[a.length + b.length];
        int bIndex = 0;
        int aIndex = 0;
        int cIndex = 0;

        while (aIndex < a.length && bIndex < b.length) {

            if (a[aIndex] >= b[bIndex]) {
                c[cIndex++] = b[bIndex++];
            } else {
                c[cIndex++] = a[aIndex++];
            }
        }
        while (bIndex < b.length) {
            c[cIndex++] = b[bIndex++];
        }
        while (aIndex < a.length) {
            c[cIndex++] = a[aIndex++];
        }
        System.out.println(Arrays.toString(c));

    }
}
