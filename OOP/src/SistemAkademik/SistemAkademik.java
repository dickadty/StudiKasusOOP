package SistemAkademik;

public class SistemAkademik {
    Student st;
    Penilaian pn;
    NilaiHuruf nh = new NilaiHuruf();

    SistemAkademik(String name, String alamat, String NIM, String jurusan, String fakultas, int[] ntugas, int nuts, int nuas, int npresentasi) {
        st = new Student(name, alamat, NIM, jurusan, fakultas);
        pn = new Penilaian(ntugas, nuts, nuas, npresentasi);

    }

    public void Penilaian() {
        st.DisplayStudent();
        double nilaiAkhir = pn.nilaiAkhir();
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        nh.setNilaiHuruf(nilaiAkhir);
        System.out.println("Nilai Huruf: " + nh.getNilaiHuruf());
    }
}