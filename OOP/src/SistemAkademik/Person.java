package SistemAkademik;

public class Person {
    String name;
    String alamat;

    public Person(String name, String alamat){
        this.name = name;
        this.alamat = alamat;
    }


    public void DisplayPerson(){
        System.out.println("Nama :"+ this.name);
        System.out.println("Alamat :"+ this.alamat);

    }
}
