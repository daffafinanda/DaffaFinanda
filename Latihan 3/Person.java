
//Superclass
public class Person {
        //atribut
        //menggunakan akses modifier protected
        protected String name;
        protected int umur;
        protected String Nim;
        protected String jurusan;

        //Konstruktor
        public Person(String Name, int umur, String Nim, String jurusan) {
                this.name = Name;
                this.umur = umur;
                this.Nim = Nim;
                this.jurusan = jurusan;
        }

        //Method
        public void display() {
                System.out.println("Name\t : " + name);
                System.out.println("Umur\t : " + umur);
                System.out.println("Nim\t\t : " + Nim);
                System.out.print("Jurusan\t : " + jurusan);
        }
        //method 2
        public void Skill() {
                System.out.println("Skill mahasiswa/i :");
        }
}



