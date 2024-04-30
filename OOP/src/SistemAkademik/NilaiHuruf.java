package SistemAkademik;
public class NilaiHuruf extends Penilaian {
    private String nilaiHuruf;

    NilaiHuruf() {
        super(new int[]{}, 0, 0, 0);
    }
    public void setNilaiHuruf(double nilaiAkhir) {
        if (nilaiAkhir >= 85) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
    }

    public String getNilaiHuruf() {
        return nilaiHuruf;
    }
}