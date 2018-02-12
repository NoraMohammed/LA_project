package main.java.ksu_is.littleauthor;


import javax.swing.text.Position;

/**
 * Created by nora on 2/10/2018 AD.
 */

public class Sticker extends Image {

    //________________________________________________________
    String sticker_category;
    //________________________________________________________
    public Sticker(String item_id, String name, Image image_file, double length, double width, Position position, String sticker_category) {
        super(item_id, name, image_file, length, width, position);

        this.sticker_category = sticker_category;}

    //________________________________________________________

    public String getSticker_category() {
        return sticker_category;
    }

    //________________________________________________________

    public void setSticker_category(String sticker_category) {
        this.sticker_category = sticker_category;
    }
}
