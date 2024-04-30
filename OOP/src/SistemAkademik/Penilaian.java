package SistemAkademik;

public class Penilaian {
    private int[] tugas;
    private int uts;
    private int uas;
    private int presensi;
    protected double nilaiAkhir;

    Penilaian(int[] tugas, int uts, int uas, int presensi) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.presensi = presensi;
    }

    public double nilaiAkhir() {
        KomponenPenilaian kp = new KomponenPenilaian(45, 20, 35, 0);
        double nilaiTugas = nilaiTugas();
        nilaiAkhir = (nilaiTugas * kp.getBtugas()) + (uts * kp.getButs()) + (uas * kp.getBuas()) + (presensi * kp.getBpresentasi());
        return nilaiAkhir;
    }

    public double nilaiTugas() {
        Perhitungan sd2 = new Perhitungan(tugas);
        return sd2.menghitungMean();
    }
}