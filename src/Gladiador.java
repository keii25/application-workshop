/**
 * This class represents the attributes and actions of a Gladiator.
 */

public class Gladiador {

    // class fields
    private String name;
    private  int attack = 10;
    private  String weapon = "blade";

    /**
     * empty builder
     */

    public Gladiador(){

    }
    /**
     * constructor of the class Gladiador
     * @param name define name of gladiator
     * @param attack defines the attack in points type int 
     * @param weapon indicates the name of the weapon used by the gladiator
     */

    public Gladiador(String name, int attack, String weapon) {
        this.name = name;        
        this.attack = attack;
        this.weapon = weapon;

    }

    /**
     * Method that returns the name gladiator
     * @return name gladiator
     */

    public String getName() {
        return name;
    }

    /**
     * Method that allows assigning a name to a gladiator
     * @param name indicates the name of the gladiator
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method indicating that the gladiator is attacking
     */

    public void attacking(){
        System.out.println("Gladiator " + this.name + " is attacking");
    }

    /**
     * Method indicating details of the gladiator
     */

    public void detailsGladiator(){
        System.out.println("Attack: "+ this.attack);
        System.out.println("Weapon: "+ this.weapon);
    }
}
