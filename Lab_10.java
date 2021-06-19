import java.io.*;
public class Lab_10 {
    public static void main(String[] args) {
        reader();
    }
    public static void reader(){
        try(BufferedReader read = new BufferedReader(new FileReader("Laab_10.txt"))){
            String Line;
            boolean key = false;
            while ((Line = read.readLine()) != null){
                boolean result = Line.matches("^(.*//.*)|(.*/\\*.*)|(.*\\*/)$");
                if(result){
                    boolean AnResult = Line.matches("^(.*\\*/)$");
                    boolean AnResult_2 = Line.matches("^(.*/\\*.*)$");
                    if(AnResult){
                        key = false;
                    }
                    else if (AnResult_2){
                        key = true;
                    }
                    else{
                        key = false;
                    }
                }
                else if (!key){
                    write(Line);
                }
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void write(String Line){
        try(BufferedWriter wr = new BufferedWriter(new FileWriter("Laaaab_10", true))){
            wr.write(Line + "\n");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}




