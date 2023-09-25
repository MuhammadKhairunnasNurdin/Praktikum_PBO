import java.util.ArrayList;
import java.util.List;

public class BukuPengunjung {
    private List<TamuVip> tamuVipList = new ArrayList<>();
    private List<TamuReguler> tamuRegulerList = new ArrayList<>();

    public BukuPengunjung() {

    }

    public void addTamuVip(TamuVip tamuVip) {
        tamuVipList.add(tamuVip);
    }

    public void addTamuReguler(TamuReguler tamuReguler) {
        tamuRegulerList.add(tamuReguler);
    }

    public void printTamuVip() {
        tamuVipList.forEach(System.out::println);
        System.out.println("*******************************");
    }

    public void printTamuReguler() {
        tamuRegulerList.forEach(System.out::println);
        System.out.println("===============================");
    }

    public void printAllTamu() {
        System.out.println("Tamu Vip:");
        printTamuVip();
        System.out.println("\nTamu Reguler:");
        printTamuReguler();
    }

}

