public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {7, 8, 4, 5, 6, 1};
        int i;
        int j;
        int temp = 0;
        int n = a.length;
        for (i = 0; i < n; i++) {
            for (j = 1; j < (n - 1); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        printArr(a);
    }
    public static void printArr(int a[]) {
        int i;
        for (i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }
}
