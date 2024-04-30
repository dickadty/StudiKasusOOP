package SistemAkademik;

public class KomponenPenilaian {
    int btugas;
    int buts;
    int buas;
    int bpresentasi;

    KomponenPenilaian(int btugas, int buts, int buas, int bpresentasi){
        this.btugas = btugas;
        this.buts = buts;
        this.buas = buas;
        this.bpresentasi = bpresentasi;
    }
    public double getBtugas(){
        return btugas/100.0;
    }
    public double getButs(){
        return buts/100.0;
    }
    public double getBuas(){
        return buas/100.00;
    }
    public double getBpresentasi(){
        return bpresentasi/100.0;
    }
}
