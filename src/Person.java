import java.util.Date;

/**
 * This class represents a Person
 */

public class Person {

    // class fields
    String name;
    String lastName;
    String lastName2;
    Date dateBirth;
    float height;

    /**
     * empty builder
     */
    public Person(){
    }

    /**
     * onstructor of the class Persona
     * @param name name of person
     * @param lastName lastname of person
     * @param lastName2 lastname2 of person
     * @param dateBirth dateBirth of person
     * @param height height of person
     */

    public Person(String name, String lastName, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName = lastName;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Method that returns the name Person
     * @return name of person
     */
    public String getName() {
        return name;
    }

    /**
     * Method that allows assigning a name to a Person
     * @param name name of person
     */

    public void setName(String name) {
        this.name = name;
    }
}
