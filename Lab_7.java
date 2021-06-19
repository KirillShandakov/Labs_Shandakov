package com.company;
import java.util.Scanner;
public class Lab_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        Riki(str);
    }
    public static void Riki(String str){
        String[] array = str.split(" ");
        String word = array[0];
        for(int i = 1;i < array.length; i++){
            if(array[i].length() < word.length()){
                word = array[i];
            }
            else{
                word = word;
            }
        }
        System.out.println(word);
    }
}


