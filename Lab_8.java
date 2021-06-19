package com.company;
import java.util.Scanner;
public class Lab_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите IP- адресс");
        String IPv4 = in.nextLine();
        boolean result = IPv4.matches("^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$" );
        if(result){
                System.out.println("IP-адрес верный");
            }
        else{
                System.out.println("IP-адрес неверный");
            }
   }
}
