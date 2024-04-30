package SistemAkademik;
public class Student extends Person {

    private String NIM;
    private String programStudi;
    private String fakultas;

    public Student(String name, String alamat, String NIM, String programStudi, String fakultas){
        super(name,alamat);
        this.NIM = NIM;
        this.programStudi = programStudi;
        this.fakultas = fakultas;
    }
    public void DisplayStudent(){
        DisplayPerson();
        System.out.println("NIM :" + NIM);
        System.out.println("Program Studi :" + programStudi);
        System.out.println("Fakultas :" + fakultas);
    }
}
