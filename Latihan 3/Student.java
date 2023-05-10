//Subclass
public class Student extends Person{
private String alamat;
protected String skill;

    //Membuat konstrurktor

    public Student(String name, int umur,String Nim, String jurusan, String alamat, String skill) {
        //Keyword super
        super(name, umur, Nim, jurusan);
        this.alamat = alamat;
        this.skill = skill;

    }
    @Override
    final public void Skill(){
        System.out.println( "\n" + skill + " adalah salah satu keahlian saya " + "\n");
    }
    }


