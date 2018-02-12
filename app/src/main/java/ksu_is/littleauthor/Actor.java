package main.java.ksu_is.littleauthor;
import javax.swing.text.Position;

/**
 * Created by nora on 2/10/2018 AD.
 */

public class Actor extends Image {

    //________________________________________________________

    private String actor_category;

    //________________________________________________________

    public Actor(String item_id, String name, Image image_file, double length, double width, Position position, String actor_category) {
        super(item_id, name, image_file, length, width, position);
        this.actor_category = actor_category;
    }

    //________________________________________________________

    public String getActor_category() {
        return actor_category;
    }

    //________________________________________________________

    public void setActor_category(String actor_category) {
        this.actor_category = actor_category;
    }


}
