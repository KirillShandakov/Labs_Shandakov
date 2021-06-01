import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Lab_4{
    public static void main(String[] args) {
        Random rrr = new Random();
        Scanner in = new Scanner(System.in);
        int[][] array;
        System.out.println("Input sequence length 1 :");
        int n = in.nextInt();
        System.out.println("Input sequence length 2:");
        int m = in.nextInt();
        array = new int[n][m];
        int a = rrr.nextInt(60);
        int b = rrr.nextInt(55);
        for(int i = 0; i < n; i++){
            a = rrr.nextInt(60);
            b = rrr.nextInt(55);
            for (int j = 0; j < m; j++) {
                array[i][j] = rrr.nextInt(60) - b;
            }
            System.out.println(Arrays.toString(array[i]));
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                max = Math.max(max, Math.abs(array[i][j]));
            }
        }
        System.out.println(max);
        System.out.println("Input k:");
        int k = in.nextInt();
        int x = 0;
        int y = 0;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if(Math.abs(array[i][j]) == max){
                    x = m - j + k;
                    y = n - i + k;
                }
            }
        }
        int[][] New_Array;
        New_Array = new int[n][m];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if(x % m - j >= 1) {
                    New_Array[i][j] = array[i][m - x % m + j];
                }
                else if (x % m + j >= m && x % m == 0) {
                    New_Array[i][j] = array[i][j];
                }
                else if (x % m - j < 1) {
                    New_Array[i][j] = array[i][j - (x % m)];
                }
            }
            System.out.println(Arrays.toString(New_Array[i]));
        }
        System.out.println("===============================");
        int[][] New_Array_2;
        New_Array_2 = new int[n][m];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if(y % n - i >= 1) {
                    New_Array_2[i][j] = New_Array[n - y % n + i][j];
                }
                else if (y % n + i >= n && y % n == 0) {
                    New_Array_2[i][j] = New_Array[i][j];
                }
                else if (y % n - i < 1) {
                    New_Array_2[i][j] = New_Array[i - (y % n)][j];
                }
            }
            System.out.println(Arrays.toString(New_Array_2[i]));
        }
    }
}