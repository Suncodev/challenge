public class Driver{
    public static void main(String[] args) throws Exception {

        Mahasiswa mhs1 = new Mahasiswa("Nizar Fadilah", "Jalan Situ Gede", "083132312082", "2103010093", 19);
        Dosen dosen1 = new Dosen("Albert Einstein", "California", "113215215", "21000235", 75);

        mhs1.Display();
        dosen1.Display();
    }
}
