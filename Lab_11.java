import java.lang.*;
import java.util.Scanner;
public class Lab_11 {
    public static void main(String[] args) {
        String Size;
        Scanner in = new Scanner(System.in);
        ClothesSizes[] Sizes = ClothesSizes.values();
        System.out.println("Выберите подходящий размер из списка:");
        for(int i = 0, j = 32; i < Sizes.length; i++){
            System.out.println(Sizes[i] + ": " + j);
            j += 2;
        }
        Size = in.nextLine();;
        ClothesSizes.getDescription(Size);  // взрослый размер
        System.out.println("Возможно, Вы передумали с размером?:");
        for(int i = 0, j = 32; i < Sizes.length; i++){
            System.out.println(Sizes[i] + ": " + j);
            j += 2;
        }
        Size = in.nextLine();;
        ClothesSizes.getDescription(Size); //  переопределить детский размер
        String[] AllClothes = {"футболка", "штаны", "юбка", "галстук"}; // массив со всеми одёжками
        System.out.println("Кому вы хотите купить одежду?: \n Мужчине - M\n Женщине - W \n Введите M или W (можно что-то другое)");
        String Pol = in.nextLine();
        if(Pol.equals("M")){
            System.out.println("Вы выбрали мужчину:");
            System.out.println("Посмотрите мужской выбор:");
            studio.DressAMan(AllClothes);
            System.out.println("Выбирайте одежду:");
            int view = in.nextInt();
            switch(view){
                case 1:
                    Clothes.Tshirt.DressAMan();
                    break;
                case 2:
                    Clothes.trousers.DressAMan();
                    break;
                case 4:
                    Clothes.tie.DressAMan();
                    break;
            }
        }
        else{
            System.out.println("Вы выбрали женщину:");
            System.out.println("Посмотрите женский выбор: \n");
            studio.DressAWoman(AllClothes);
            System.out.println("Выбирайте одежду:");
            int view = in.nextInt();
            switch(view){
                case 1:
                    Clothes.Tshirt.DressAWoman();
                    break;
                case 2:
                    Clothes.trousers.DressAWoman();
                    break;
                case 3:
                    Clothes.skirt.DressAWoman();
                    break;
            }
        }
    }
    public enum ClothesSizes { // перечисление с размерами одежды
        XXS(32),
        XS(34),
        S(36),
        M(38),
        L(40);
        int euroSize;
        ClothesSizes(int euroSize) {
            this.euroSize = euroSize; // конструктор для размеров одежды
        }
        public static void getDescription(String Size) {
            if (Size.equals("32") | Size.equals("XXS") ){
                System.out.println("Вы выбрали детский размер");
            }
            else {
                System.out.println("Вы выбрали взрослый размер");
            }
        }
    }
    public interface MensSwear {         // интерфейс мужская одежда
        static void DressAMan(String view) {  // одеть мужчину
            Scanner in = new Scanner(System.in);
            System.out.println("Вы покупаете?:");
            System.out.println("y - если да\n n - если нет");
            String yn = in.nextLine();;
            if(yn.equals("y")){
                System.out.println("Вы купили " + view);
            }
            else{
                System.out.println("Вы ничего не купили");
            }
        }
    }
    public interface WomenSwear {    // интерфейс жеснская одежда
        static void DressAWoman(String view) {        // одеть женщину
            Scanner in = new Scanner(System.in);
            System.out.println("Вы покупаете?:");
            System.out.println("y - если да \nn - если нет");
            String yn = in.nextLine();;
            if(yn.equals("y")){
                System.out.println("Вы купили " + view);
            }
            else{
                System.out.println("Вы ничего не купили");
            }
        }
    }
    abstract static class Clothes { //одежда
        String Size, ThePrice, TheColor;
        public static class Tshirt extends Clothes {       //футболка
            static void DressAMan() {
                MensSwear.DressAMan("мужскую футболку");
            }
            static void DressAWoman() {
                WomenSwear.DressAWoman("женскую футболку");
            }
        }
        public static class trousers extends Clothes { // штаны
            static void DressAMan() {
                MensSwear.DressAMan("мужские штаны");
            }
            static void DressAWoman() {
                WomenSwear.DressAWoman("женские штаны");
            }
        }
        public static class skirt extends Clothes { // юбка
            static void DressAWoman() {
                WomenSwear.DressAWoman("юбку");
            }

        }
        public static class tie extends Clothes { // галстук
            static void DressAMan() {
                MensSwear.DressAMan("галстук");
            }
        }
    }
    static class studio {
        static void DressAMan(String[] AllClothes){ // метод  одеть мужчину
            System.out.println("Мужская одежда:");
            for(int i = 0; i < AllClothes.length; i++){
                if(i == 2){
                    continue;
                }
                System.out.println(AllClothes[i] +  " - " + (i+1));
            }


        }
        static void DressAWoman(String[] AllClothes){ // метод одеть женщину
            System.out.println("Женская одежда: ");
            for(int i = 0; i < AllClothes.length; i++){
                if(i == 3){
                    continue;
                }
                System.out.println(AllClothes[i] +  " - " + (i + 1) );
            }

        }
    }
}
