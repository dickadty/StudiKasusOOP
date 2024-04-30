package Library;

public class Majalah extends LibraryCollection{
    private String kodeKoleksi;
    private String namaMajalah;
    private String penerbit;
    private String tahunTerbit;

    Majalah(){

    }
    Majalah(String kodeKoleksi, String namaMajalah, String penerbit, String tahunTerbit){
        this.kodeKoleksi = kodeKoleksi;
        this.namaMajalah = namaMajalah;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public void setKodeKoleksi(String kodeKoleksi) {
        this.kodeKoleksi = kodeKoleksi;
    }

    public String getKodeKoleksi() {
        return kodeKoleksi;
    }

    public void setNamaMajalah(String namaMajalah) {
        this.namaMajalah = namaMajalah;
    }

    public String getNamaMajalah() {
        return namaMajalah;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public String getTahunTerbit() {
        return tahunTerbit;
    }
    public void printCollection(){
        System.out.println("Kode Koleksi: " + kodeKoleksi);
        System.out.println("Nama Majalah: " + namaMajalah);
        System.out.println("Penerbit: " + penerbit);
        System.out.printf("Tahun Terbit: %s\n", tahunTerbit);

    }
}
