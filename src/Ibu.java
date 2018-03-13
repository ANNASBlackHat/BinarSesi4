
public class Ibu extends Manusia implements IbuInterface{

    private IbuInterface ibuInterface;

    public void memiliki(Object obj){
        if(obj instanceof Ayah || obj instanceof Anak){
            Ayah ayah = (Ayah) obj;  //casting
            System.out.println("Ibu memiliki "+ayah.getName());
        }
    }

    @Override
    public void melahirkan(String jk) {
        System.out.println("Ibu melahirkan anak "+jk);
    }

    public void saatMelahirkan(IbuInterface ibuInterface){
        this.ibuInterface = ibuInterface;
    }

    public void setUsiaKandungan(int bulan){
        if(bulan >= 9){
            ibuInterface.melahirkan("Laki-laki");
        }
    }
}
