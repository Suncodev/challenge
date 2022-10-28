public class Mahasiswa extends Manusia  {

    private String nim;

    public Mahasiswa(String nama, String alamat, String noHp, String nim, int umur) {
        super(nama, alamat, noHp, umur);
        this.nim = nim;

    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void Display(){
        System.out.println("Nama    :" + nama);
        System.out.println("No Hp   :" + noHp);
        System.out.println("NIM     :" + nim);
        System.out.println("Tahun Lahir : " + umur);
    }
    
}
