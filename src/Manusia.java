public class Manusia {
    private String name;
    private int age;

    public void berjalan(String tujuan){
        System.out.println(name + " Berjalan Menuju " + tujuan);
    }

    //Generate Setter & Getter: cmd+n (MAC)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
