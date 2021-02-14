
import java.util.Scanner;

public class lab_3_shand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input k:");
        int k = in.nextInt();
        System.out.println("Input n:");
        int n = in.nextInt();
        double otvet = Math.sqrt(k * n);
        for(int i = (n - 1); i != 0; i--){
            otvet = Math.sqrt((k * i) + otvet);
        }
        System.out.printf("%.3f", otvet);
        }
    }
