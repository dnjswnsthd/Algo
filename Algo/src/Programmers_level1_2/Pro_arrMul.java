package Programmers_level1_2;

// 프로그래머스 코딩테스트 연습 행렬의 곱셈

public class Pro_arrMul {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = { {1, 4 }, { 3, 2 }, { 4, 1 } };
        int[][] arr2 = { { 3, 3 }, { 3, 3 } };
        int[][] arr3 = solution(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }
    }
}
