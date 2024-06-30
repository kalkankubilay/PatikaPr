package OgrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stdNo;
    String classes;
    double avg;
    boolean isPass;

    public Student( String name, String stdNo, String classes, Course c1, Course c2, Course c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.avg = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int note2, int note3){
        if (note1 >= 0 && note1 <=100){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <=100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <=100){
            this.c3.note = note3;
        }

    }

    void isPass(){
        this.avg = (this.c1.note+ this.c2.note+this.c3.note)/3.0;
        if (this.avg >= 55){
            System.out.println("Sınıfı geçtiniz.");
        }
        else{
            System.out.println("Kaldın mal.");
        }
        printNote();
    }


    void printNote(){
        System.out.println(this.c1.name + " notu: " + this.c1.note);
        System.out.println(this.c2.name + " notu: " + this.c2.note);
        System.out.println(this.c3.name + " notu: " + this.c3.note);
        System.out.println("Ortalamanız: " + this.avg);
        System.out.println(" ");
    }

}
