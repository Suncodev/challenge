public class Manusia {

    protected String nama;
    protected String alamat;
    protected String noHp;
    protected int umur;



    public Manusia(String nama, String alamat, String noHp, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.umur = 2022 - umur;
    }

    public int getUmur (){
        return umur;
    }

    public void setUmur(){

    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoHp() {
        return noHp;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

}
