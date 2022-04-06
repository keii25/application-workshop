import java.util.ArrayList;
@SuppressWarnings("unused")

/**
 * class declaration Fruta
 */

public class Fruta {   
    
    // class fields
    public String name;
    private float averageWeight;
    public ArrayList<String> colors = new ArrayList<>();


    /**
     * empty builder
     */
    public Fruta(){
    }

    /**
     * constructor of the class Fruta
     * @param name define the name of the fruit
     * @param averageWeight defines the average weight of the fruit of type float
     * @param colors defines a list of colors
     */

    public Fruta(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * method that returns a list of colors of the fruit
     * @return fruit color list
     */

    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * method that adds the name of the color of the fruit to a list
     * @param name color name
     */

    public void setColor(String name){
        this.colors.add(name);
    }
}
