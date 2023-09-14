import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SistemNilai sistemNilai = new SistemNilai();

        Matkul matkul1 = new Matkul("OOP");
        Matkul matkul2 = new Matkul("WEB");
        Matkul matkul3 = new Matkul("BasDat");
        Matkul matkul4 = new Matkul("GUI");

        Dosen dosen1 = new Dosen("Anas", "111", matkul1, matkul2);
        Dosen dosen2 = new Dosen("Tono", "222", matkul3, matkul4);
        sistemNilai.addDosen(dosen1, dosen2);

        Mahasiswa mahasiswa1 = new Mahasiswa("Joni", "4444");
        Mahasiswa mahasiswa2 = new Mahasiswa("Jono", "5555");
        Mahasiswa mahasiswa3 = new Mahasiswa("Jena", "6666");
        Mahasiswa mahasiswa4 = new Mahasiswa("Jelo", "7777");
        sistemNilai.addMahasiswa(mahasiswa1, mahasiswa2, mahasiswa3, mahasiswa4);


        do {
            menu();
            try {
                switch (input.nextLine()) {
                    case "1" -> {
                        Mahasiswa objMhs;
                        boolean isNotValidate;
                        do {
                            objMhs = Mahasiswa.loginMahasiswa(input);
                            isNotValidate = sistemNilai.isMahasiswaNonValid(objMhs);
                            if (isNotValidate) {
                                System.out.println("Cannot to login, try to input again");
                            } else {
                                System.out.println("Login success\n==============================");
                            }
                        } while (isNotValidate);
                        objMhs.printEvaluation(sistemNilai);
                    }
                    case "2" -> {
                        Dosen objDosen;
                        boolean isNotValidate;
                        do {
                            objDosen = Dosen.loginDosen(input);
                            isNotValidate = sistemNilai.isDosenNonValid(objDosen);
                            System.out.println(isNotValidate);
                            if (isNotValidate) {
                                System.out.println("Cannot to login, try to input again");
                            } else {
                                System.out.println("Login success\n==============================");
                            }
                        } while (isNotValidate);
                        objDosen.inputNilai(sistemNilai, input);
                    }
                    case "3" -> {
                        input.close();
                        System.exit(0);
                    }
                }
            } catch (InputMismatchException ime) {
                // this to handle Exception when you have mismatch in Scanner
                System.out.println("Input data types is unmatched at: " + ime.getStackTrace()[4]);
                input.nextLine();// this code for stopping do-while for stackOverflow
            }
        } while (true);
    }

    private static void menu() {
        System.out.print("====================================\n1.Show Evaluation(Mahasiswa)\n2.Input Score(Dosen)\n3.Out\n====================================\nChoose: ");
    }
}
