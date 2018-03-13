public class Ibu extends Manusia{

    public void memiliki(Object obj){
        if(obj instanceof Ayah || obj instanceof Anak){
            Ayah ayah = (Ayah) obj;  //casting
            System.out.println("Ibu memiliki "+ayah.getName());
        }
    }
}
