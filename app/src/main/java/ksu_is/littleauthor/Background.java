package main.java.ksu_is.littleauthor;
import java.awt.Color;
import javax.swing.text.Position;

/**
 * Created by nora on 2/10/2018 AD.
 */

public class Background extends Image {

    //________________________________________________________

    private String background_category;
    private Color background_color;

    //________________________________________________________

    public Background(String item_id, String name, Image image_file, double length, double width, Position position, String background_category, Color background_color ) {
        super(item_id, name, image_file, length, width, position);

        this.background_category = background_category;
        this.background_color = background_color;

    }

    //________________________________________________________

    public void changeBackgroundColor(){}

    //________________________________________________________

    public String getBackground_category() {
        return background_category;
    }

    //________________________________________________________

    public void setBackground_category(String background_category) {
        this.background_category = background_category;
    }

    //________________________________________________________

    public Color getBackground_color() {
        return background_color;
    }

    //________________________________________________________

    public void setBackground_color(Color background_color) {
        this.background_color = background_color;
    }

}


