package tugas;

import java.util.ArrayList;
import java.util.List;

public class DemoSewaGame {
    public static void main(String[] args) {
        List<SewaGame> sewaGameList = new ArrayList<>();

        sewaGameList.add(new SewaGame("001", "Anas", "God of War", 2, 10000));
        sewaGameList.add(new SewaGame("002", "Anas", "GTA 5", 8, 12000));
        sewaGameList.add(new SewaGame("003", "Tono", "Mutant Gladiator", 3, 5000));

        System.out.println("Berikut data Rental Game");
        sewaGameList.forEach(SewaGame::printBorrower);
    }
}
