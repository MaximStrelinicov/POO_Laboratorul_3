import java.util.List;
public class Main {
    public static void main(String[] args) {
        Leptop HP = new Leptop("HP","Strix","Spaces grey");
        Leptop ASUS = new Leptop("ASUS","Rog","Black",32,17.3);
        Leptop MacBook = new Leptop("MacBook","Pro 14 ","midnight",16,14.2,1.61);
        List<Leptop> list = List.of(HP,ASUS,MacBook);
        for(Leptop leptop : list){
            System.out.println(leptop);
        }

    }
}