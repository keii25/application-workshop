import java.util.Date;

public class Persona {
    String name;
    String lastName;
    String lastName2;
    Date dateBirth;
    float height;


    public Persona(){
    }

    public Persona(String name, String lastName, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName = lastName;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
