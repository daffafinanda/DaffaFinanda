public  class Main {
    public static void main(String[] args) {

        Student student = new Student("Dhimas", 20, "12250111231", "Teknik Informatika", "Payung sekaki", "Bermain alat musik");
        student.display();
        student.Skill();

        Student student1 = new Student("Daffa finanda", 19, "12250111603", "Teknik Informatika", "Bukit barisan", "Futsal");
        student1.display();
        student1.Skill();

        Student student2 = new Student("Aufa Hajati", 19, "12250120338", "Teknik Informatika", "Tampan", "Memasak");
        student2.display();
        student2.Skill();
    }
}