/**
 * This class represents the Album of an artist with some methods of the class
 * 
 */

public class Album {
    // class fields
    private String name;
    private String description = "album description";
    private String author = "Adele";

    /**
     * empty builder
     */
    public Album(){

    }

    /**
     * We define the constructor of the class
     * @param name defines the album name
     * @param description album description
     * @param author indicates the name of the author of the album
     */
    public Album(String name, String description, String author) {
        this.name = name;
        this.description = description;
        this.author = author;
    }

    /**
     * Method that returns the name of the album
     * @return album name
     */

    protected String getName() {
        return name;
    }

    /**
     * method that assigns a name to the album
     * @param name is a string with the name of the album to assign
     */

    protected void setName(String name) {
        this.name = name;
    }

    /**
     * method that allows listening to the album
     */

    public void listen(){
        System.out.println("Listen to " + this.name);
    }

    /**
     * method showing album details
     */

    public void detailsAlbum(){
        System.out.println("Description: "+ this.description);
        System.out.println("Author: "+ this.author);
    }
}
