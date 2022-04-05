public class Gladiador {
    private String name;
    private  int attack = 10;
    private  String weapon = "blade";

    public Gladiador(){

    }

    public Gladiador(String name, int attack, String weapon) {
        this.name = name;        
        this.attack = attack;
        this.weapon = weapon;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attacking(){
        System.out.println("Gladiator " + this.name + " is attacking");
    }

    public void detailsGladiator(){
        System.out.println("Attack: "+ this.attack);
        System.out.println("Weapon: "+ this.weapon);
    }
}
