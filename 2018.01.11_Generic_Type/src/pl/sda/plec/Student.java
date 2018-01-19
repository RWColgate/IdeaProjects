package pl.sda.plec;

public class Student extends Czlowiek {
    public Student(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if(this.plec == Plec.KOBIETA){
            builder.append("Studewntka ");
        }else{
            builder.append("Student ");
        }
        builder.append(this.imie).append(" ").append(this.nazwisko);
        return builder.toString();
    }
}
