package day3;

public class Array2 {
    public static void main(String[] args) {

        // 2차원 배열 -> 배열의 배열

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] arr3 = {9, 10, 11, 12};

        int[][] darr = {arr1, arr2, arr3};

        int[] arr4 = darr[0]; // arr1 과 동일

        System.out.println(darr[0][0]); // System.out.println(arr4[0]); 동일
        System.out.println(darr[1][0]);

        // 이차원배열[세로][가로]
        // 이차원배열[행][열]


        // 2차원 배열 선언

        int[][] darr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {10, 11, 12, 13}
        };
        System.out.println(darr[1][2]);

        System.out.println("========= 2차원 배열 순회 =========");
        // 2차원 배열 순회

        for (int i = 0; i < 4; i++) {
            System.out.println(darr[0][i]);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(darr[1][i]);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(darr[2][i]);
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(darr[j][i] + " ");
            }
            System.out.println();
        }
    }
}

