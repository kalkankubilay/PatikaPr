package OgrenciBilgiSistemi;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Kubilay", "555", "TRH");
        Teacher t2 = new Teacher("Kube", "111", "MATH");
        Teacher t3 = new Teacher("Kaan", "122","SE");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course math = new Course("Matematik","101","MATH");
        math.addTeacher(t2);
        Course se = new Course("Yazılıma Giriş","101","SE");
        se.addTeacher(t3);

        Student s1 = new Student("Kubilay KALKAN", "1213", "4",tarih,math,se);
        s1.addBulkExamNote(100,100,100);
        s1.isPass();

        Student s2 = new Student("Kube KALKAN", "1213", "4",tarih,math,se);
        s2.addBulkExamNote(54,60,51);
        s2.isPass();
    }

}
