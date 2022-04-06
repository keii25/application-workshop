import java.sql.Date;
/**
 * This class represents a Message
 */
public class Mensaje {

    // class fields
    private String title;
    private String description;
    private Date released;

    /**
     * empty builder
     */
    public  Mensaje(){
    }

    /**
     * constructor of the class Mensaje
     * @param title defines the title of the Mensaje
     * @param description defines the description of the message
     * @param released indicates the posting date of the message
     */

    public Mensaje(String title, String description, Date released) {
        this.title = title;
        this.description = description;
        this.released = released;
    }
    /**
     * method that returns a title of the message
     * @return title of the message
     */
    public String getTitle() {
        return title;
    }

    /**
     * method that assigns the title of the message
     * @param title The parameter defines the title of the message
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * method that returns the description of the message
     * @return description of the message
     */

    public String getDescription() {
        return description;
    }

    /**
     * method that assigns a description to the message
     * @param description defines the description of the message
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * method that returns the posting date of the message
     * @return released that indicates the posting date of the message
     */

    public Date getReleased() {
        return released;
    }

    /**
     * method that assigns the date of publication of a message
     * @param released date of publication of a message
     */

    public void setReleased(Date released) {
        this.released = released;
    }

    /**
     * method that read a message
     */
    public void read(){
        System.out.println("consulting message");
    }
}
