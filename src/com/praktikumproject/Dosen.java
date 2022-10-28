public class Dosen extends Manusia{

    private String nidn;

    public Dosen(String nama, String alamat, String noHp, String nidn, int umur) {
        super(nama, alamat, noHp, umur);
        this.nidn = nidn;

    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void Display(){
        System.out.println("\n");
        System.out.println("Nama    :" + nama);
        System.out.println("No Hp   :" +noHp);
        System.out.println("NIDN    :" +nidn);
        System.out.println("Tahun Lahir : " + umur);

    }
    
}
