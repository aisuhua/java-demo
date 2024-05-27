import java.util.Arrays;

class Demo03 {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0; i< 10; i++) {
//            sum += i;
//        }
//
//        System.out.println(sum);

//        int[] arr = new int[] {1, 2, 3, 4, 5};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        int[] arr = {1, 2, 3, 4, 5};
//        for (int n : arr) {
//            System.out.println(n);
//        }

//        int[] arr = {6, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] a : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr));

    }
}
