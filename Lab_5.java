import java.util.Arrays;
import java.util.Scanner;
public class Lab_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = rrr.nextInt(20) - 10;
        }
        System.out.println(Arrays.toString(array));
        Inscretion(array);
        System.out.println(Arrays.toString(array));
        int j = 0;
        for(int i = 1; i < 10; i ++){
            if(array[i - 1] == array[i]){
                j++;
            }
        }
        System.out.println(j);
        int[] Narray = new int[10 - j];
        delete(array, Narray);
        System.out.println(Arrays.toString(Narray));
    }
    public static void Inscretion(int[] array) {
        for(int i = 1; i < 10; i ++){
            int x = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > x){
                array[j] = array[j - 1];
                --j;
            }
            array[j] = x;
        }
    }
    public static void delete(int[] array, int[] Narrray) {
        int j = 0;
        for(int i = 1; i < 10; i ++){
            if(array[i - 1] != array[i]){
                Narrray[j] = array[i - 1];
                j++;
            }
        Narrray[j] = array[9];
        }
    }
}