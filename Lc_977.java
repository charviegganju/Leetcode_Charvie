import java.util.Arrays;
import java.util.Scanner;

class Lc_977 {
    public int[] sortedSquares(int[] numArr) {
        int n = numArr.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = numArr[i] * numArr[i];
        }

        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] numArr = new int[a];

        for (int i = 0; i < a; i++) {
            numArr[i] = sc.nextInt();
        }

        Lc_977 obj = new Lc_977();
        int[] result = obj.sortedSquares(numArr);

        System.out.println(Arrays.toString(result));
    }
}