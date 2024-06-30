package OgrenciBilgiSistemi;

public class Teacher {
    String name;
    String mpno;
    String brach;

    public Teacher(String name, String mpno, String brach) {
        this.name = name;
        this.mpno = mpno;
        this.brach = brach;
    }

    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("No: " + this.mpno);
        System.out.println("Branch: " + this.brach);
        System.out.println(" ");
    }
}
