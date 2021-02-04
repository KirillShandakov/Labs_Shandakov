package com.company;
import java.util.Scanner;


public class Lab_1_shand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a alpha:");
        float alpha = in.nextInt();
        float z_1 = (float) ((Math.sin (2 * alpha) + Math.sin(5 * alpha) - Math.sin(3 * alpha)) /
                (Math.cos(alpha) - Math.cos(3 * alpha) + Math.cos(5 * alpha)) );
        System.out.println(z_1);


    }
}
