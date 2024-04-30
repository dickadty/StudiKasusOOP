package KonversiNilai;
class Mahasiswa{
    private String nama;
    public int nilai;

    Mahasiswa(String nama, int nilai){
        this.nama = nama;
        this.nilai = nilai;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getNilai(){
        return nilai;
    }
    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    public String Kondisi(){
        if (getNilai() >= 90){
            return ("Anda mendapat nilai TabelP2");
        }else if (getNilai() >= 50){
            return ("Anda mendapat nilai Tabel2");
        }else  {
            return ("Anda mendapat nilai E");
        }
    }
    public void Display(){
        System.out.println("Nama :" + getNama());
        System.out.println("Nilai :" + getNilai());
        System.out.println("Catatan :" + Kondisi());
    }

}
public class KonversiNilaiRun {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Dicky",90);
        Mahasiswa mahasiswa2 = new Mahasiswa("Salman", 60);
        mahasiswa1.Display();
        mahasiswa2.Display();


    }
}

