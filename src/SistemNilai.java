import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SistemNilai {
    public final List<Dosen> dosenList;
    private final List<Mahasiswa> mahasiswaList;
    private final List<Nilai> nilaiList;

    public SistemNilai() {
        this.dosenList = new ArrayList<>();
        this.mahasiswaList = new ArrayList<>();
        this.nilaiList = new ArrayList<>();
    }

    public void addDosen(Dosen... obj) {
        dosenList.addAll(Arrays.asList(obj));
    }

    public void addMahasiswa(Mahasiswa... obj) {
        mahasiswaList.addAll(Arrays.asList(obj));
    }

    public boolean isDosenNonValid(Dosen dosen) {
        return dosenList.stream().noneMatch(dosen1 -> dosen1.equals(dosen));
    }
    public void addNilai(Nilai objNilai) {
        if (objNilai == null) {
            System.out.println("Cannot adding nilai, cause matkul not valid");
            return;
        }
        nilaiList.add(objNilai);
    }

    public boolean isMahasiswaNonValid(Mahasiswa mahasiswa) {
        return mahasiswaList.stream().noneMatch(mahasiswa1 -> mahasiswa1.equals(mahasiswa));
    }
    private Nilai searchNilai(Mahasiswa mahasiswa) {
        return nilaiList.stream().filter(nilai -> nilai.mahasiswa().equals(mahasiswa)).findFirst().orElse(null);
    }
    public void printEvaluation(Mahasiswa mahasiswa) {
        Nilai objNilai = searchNilai(mahasiswa);

        if (objNilai == null) {
            System.out.println("Nilai is undefined");
            return;
        }
        System.out.println(objNilai);
    }




}
