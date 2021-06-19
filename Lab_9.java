package com.company;
import java.util.Scanner;
import java.io.*;
public class Lab_9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите IP- адресс");
        String IPv4 = in.nextLine();
        String text = "";
        boolean result = IPv4.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}" +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$");
        if(result) {
            text = "IP-адрес верный";
            write(text, IPv4);
        }
        else{
            text = "IP-адрес неверный";
            write(text, IPv4);
        }
        System.out.println("Введите ключевое слово");
        String key = in.nextLine();
        if (key.equals("privet")){
            read();
        }
    }
    public static void write(String text, String IPv4){
        try(BufferedWriter wr = new BufferedWriter(new FileWriter("Laab_9.txt"))){
            wr.write(text);
            wr.write("\n"+ "IPv4: " + IPv4);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void read(){
        try(BufferedReader r = new BufferedReader(new FileReader("Laab_9.txt"))){
            String prov;
            while ((prov = r.readLine()) != null){
                System.out.println(prov);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
