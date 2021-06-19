package com.company;
import java.util.ArrayList;
import java.util.List;
public class Lab_14 {
    public static void main(String[] args) {
        Group ez = new Group();
        Group koef = new Group();
        Group stav = new Group();
        Group pup = new Group();
        Dashboard Group1 = new Dashboard(ez);
        ez.changeSub(5000, 500 );
        Dashboard Group2 = new Dashboard(koef);
        koef.changeSub(75000, 600);
        Dashboard Group3 = new Dashboard(stav);
        stav.changeSub(1000000, 800);
        Dashboard Group4 = new Dashboard(pup);
        stav.changeSub(300000, 100);
    }
}
interface Notifier{
    void addinferver(inferver inf);
}
class Group implements Notifier{
    private List infervers;
    private int subscribers, like;
    public Group(){
        infervers = new ArrayList();
    }
    public void addinferver(inferver inf) {
        infervers.add(inf);
    }
    public void notifyinferver() {
        for (int i = 0; i < infervers.size(); i++){
            inferver inf = (inferver)infervers.get(i);
            inf.info(subscribers, like);
        }
    }
    public void changeSub(int subscribers, int like){
        this.subscribers = subscribers;
        this.like = like;
        notifyinferver();
    }
}
interface inferver{
    void info(int subscribers, int like);
}
class Dashboard implements inferver{
    private Notifier notifier;
    private int subscribers;
    private int like;
    public Dashboard(Notifier notifier){
        this.notifier = notifier;
        notifier.addinferver(this);
    }
    public void info(int subscribers, int like) {
        this.subscribers = subscribers;
        this.like = like;
        show();
    }
    public void show(){
        System.out.println( "Количество подписчиков: " + subscribers + " Количество лайков: " + like);
    }
}