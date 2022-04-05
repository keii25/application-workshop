import java.sql.Date;

public class Mensaje {
    private String title;
    private String description;
    private Date released;

    public  Mensaje(){

    }

    public Mensaje(String title, String description, Date released) {
        this.title = title;
        this.description = description;
        this.released = released;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleased() {
        return released;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public void read(){
        System.out.println("consulting message");
    }
}
