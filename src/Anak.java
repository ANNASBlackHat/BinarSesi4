public class Anak extends Ayah{

    //override : mendeklarasikan kembali method yang ada di kelas induk
    public void berjalan(String tujuan){
        //super : mengacu ke kelas induk
//        super.berjalan(tujuan);
        System.out.println("Naik motor ke "+tujuan);
    }

    public void belajar(){

    }
}
