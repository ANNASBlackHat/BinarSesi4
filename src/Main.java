public class Main {

    //psvm
    public static void main(String[] args) {
        Anak anak = new Anak();
        anak.setName("Luna");
//        anak.berjalan("Sekolah");

        //objek ayah  mengakses yg ada di kelas ayah saja
        Ayah ayah = new Ayah();
        ayah.setName("Yusuf Abdillah");
        ayah.berjalan("Pantai");

        //polymorphism
        //objek ayah1 mengakses yg ada di kelas anak
        Ayah ayah1 = new Anak();
        ayah1.berjalan("Kantor");

        Ibu ibu = new Ibu();
        ibu.memiliki(anak);
        ibu.memiliki(ayah);
    }

}
